package kaufland.com.business.fetcher;

import java.util.ArrayList;
import java.util.List;

import kaufland.com.business.model.RecipeSearchResultModel;

/**
 * Created by sbra0902 on 26.10.17.
 */

public class MockData {

    public static List<RecipeSearchResultModel> data = new ArrayList<>();

    static{
        RecipeSearchResultModel model = new RecipeSearchResultModel();
        model.setImageUrl("");
    }
}
