package kaufland.com.business.fetcher;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;
import org.json.JSONException;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by sbra0902 on 10.05.17.
 */

@EBean
public abstract class BaseFetcher<DTO> extends BackgroundWorker<DTO> {

    private static final String TAG = BaseFetcher.class.getName();

    @Bean
    protected RestCaller mRestCaller;

    private Gson mGson;

    protected BaseFetcher() {
        mGson = new GsonBuilder().create();
    }


    public void fetchAsync(final BackgroundWorkerCallback callback, final Context context) {
        Log.d(TAG, String.format("fetchAsync: %s", callback));
        doWork(callback, context);
    }


    public DTO fetch(Context context) throws Exception {
        return invoke();
    }

    protected DTO doInBackground(Context context) {
        Log.d(TAG, "doInBackground");

        try {
          return invoke();
        } catch (final Exception e) {
            Log.e(TAG, e.getMessage(), e);
            onError(e);
        }

        return null;
    }

    private DTO invoke() throws Exception {
        try {
            init();
            InputStream responseStream = mRestCaller.invoke(createInvoker());
            DTO result = mapToDto(responseStream, mGson);
            return result;
        } finally {
            close();
        }
    }

    public abstract RestCaller.RestInvoker createInvoker();

    protected abstract void init();

    protected abstract void close();

    protected abstract DTO mapToDto(InputStream entity, Gson gson) throws IOException, JSONException;
}
