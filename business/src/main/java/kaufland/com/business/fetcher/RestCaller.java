package kaufland.com.business.fetcher;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import kaufland.com.business.rest.HackApi;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@EBean
public class RestCaller {

    private static final int STATUS_CODE_SESSION_EXPIRED = 401;
    private static final int STATUS_CODE_OUTDATED_APP_VERSION = 417;
    private static final String TAG = RestCaller.class.getName();

    public interface RestInvoker {
        Response<ResponseBody> call(HackApi api) throws Exception;
    }

    protected HackApi mAPI;

    @RootContext
    Context mContext;

    @AfterInject
    public void init() {
        mAPI = new Retrofit.Builder()
                .client(new OkHttpClient())
                .baseUrl("https://southcentralus.api.cognitive.microsoft.com/customvision/v1.0/")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build().create(HackApi.class);
    }

    public InputStream invoke(RestInvoker invoker) throws Exception {

        Response<ResponseBody> response = null;
        try {
            response = invoker.call(mAPI);
            if (!response.isSuccessful()) {
                String errorBody = response.errorBody().string();
                Log.e(TAG, "code: " + response.code() + "body:" + errorBody);

                throw new IOException("Request Failed!");
            }

            InputStream responseStream = response.body().byteStream();

            return responseStream;
        } catch (SocketTimeoutException | UnknownHostException ste) {
            Log.e(TAG, ste.getMessage(), ste);
        } finally {
            if (response != null) {
                Util.closeQuietly(response.body());
            }
        }

        return null;
    }

}
