package kaufland.com.business.mocks;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.RootContext;
import org.apache.commons.io.IOUtils;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import kaufland.com.business.R;
import kaufland.com.business.model.RecipeSearchResultModel;

/**
 * Created by dsch1006 on 26.10.17.
 */

@EBean
public class Mocks {

    @RootContext
    protected Context context;

    private static final Type REVIEW_TYPE = new TypeToken<List<RecipeSearchResultModel>>() {
    }.getType();

    public List<RecipeSearchResultModel> getRecipies(){
        Gson gson = new Gson();
        List<RecipeSearchResultModel> resultModelList = new ArrayList<>();
        try {
            InputStream inputStream = context.getResources().openRawResource(R.raw.recipes);


            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                resultModelList = gson.fromJson( IOUtils.toString(inputStream), REVIEW_TYPE);
            }
        } catch (IOException e) {

        }
        return resultModelList;
    }
}
