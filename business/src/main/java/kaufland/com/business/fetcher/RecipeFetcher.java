package kaufland.com.business.fetcher;

import android.content.Context;

import com.google.gson.Gson;

import org.androidannotations.annotations.EBean;
import org.json.JSONException;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import kaufland.com.business.model.RecipeSearchResultModel;
import kaufland.com.business.rest.HackApi;
import okhttp3.ResponseBody;
import retrofit2.Response;

/**
 * Created by sbra0902 on 26.10.17.
 */
@EBean
public class RecipeFetcher extends BaseFetcher<RecipeSearchResultModel> {

    private byte[] mData;

    public void fetchAsync(BackgroundWorkerCallback callback, Context context, byte[] data) {
        mData = data;
        super.fetchAsync(callback, context);
    }

    @Override
    public RestCaller.RestInvoker createInvoker() {
        return new RestCaller.RestInvoker() {
            @Override
            public Response<ResponseBody> call(HackApi api) throws Exception {
                return api.init(mData);
            }
        };
    }

    @Override
    protected void init() {

    }

    @Override
    protected void close() {

    }

    @Override
    protected RecipeSearchResultModel mapToDto(InputStream entity, Gson gson) throws IOException, JSONException {
        return gson.fromJson(new InputStreamReader(entity), RecipeSearchResultModel.class);
    }
}
