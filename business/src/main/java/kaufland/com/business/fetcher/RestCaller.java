package kaufland.com.business.fetcher;

import android.content.Context;
import android.util.Log;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;

import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import retrofit2.Response;

@EBean
public class RestCaller {

    private static final int STATUS_CODE_SESSION_EXPIRED = 401;
    private static final int STATUS_CODE_OUTDATED_APP_VERSION = 417;
    private static final String TAG = RestCaller.class.getName();

    public interface RestInvoker {
        Response<ResponseBody> call(TESTAPI api) throws Exception;
    }

    protected TESTAPI mAPI;

    @RootContext
    Context mContext;

    @AfterInject
    public void init(){
        //TODO create Retrofit here
    }

    public InputStream invoke(RestInvoker invoker) throws Exception {

        Response<ResponseBody> response = null;
        try {
            response = invoker.call(mAPI);
            if (!response.isSuccessful()) {
                String errorBody = response.errorBody().string();
                Log.e(TAG, "code: "+ response.code() + "body:" +errorBody);

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
