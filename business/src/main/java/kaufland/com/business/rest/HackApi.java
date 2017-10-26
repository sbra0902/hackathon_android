package kaufland.com.business.rest;

import com.google.gson.Gson;

import java.util.List;

import kaufland.com.business.model.RecipeSearchResultModel;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface HackApi {

    @POST("/Prediction/739b7604-8e08-497a-8e6c-41b9032f5dce/image?iterationId=68b61db1-e0e1-455d-8cf2-d52f63eb3bc9")
    @Headers({
            "Content-Type: application/octet-stream",
            "Prediction-Key: 46c5e01c3dfc4b4fbeeac70894615b83"
    })
    List<RecipeSearchResultModel> init(@Body byte[] image);

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://southcentralus.api.cognitive.microsoft.com/customvision/v1.0")
            .addConverterFactory(GsonConverterFactory.create(new Gson()))
            .build();

}
