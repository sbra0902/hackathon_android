package kaufland.com.business.fetcher;

import java.util.ArrayList;
import java.util.List;

import kaufland.com.business.model.RecipeSearchResultModel;

/**
 * Created by sbra0902 on 26.10.17.
 */

public class MockData {

    public static List<RecipeSearchResultModel> data = new ArrayList<>();

    static {
        RecipeSearchResultModel model = new RecipeSearchResultModel();
        model.setId("38d7d353-c2f5-4c05-846c-79452d10f4f8");
        model.setImageUrl("https://media.kaufland.de/images/PPIM/AP_Content_2708/std.lang.all/81/35/Asset_818135.jpg");
        model.setRecipeId("DE_2879");
        model.setRecipeName("Schnitzel mit deutschem Spargel");
        model.setPortionCount("4");
        model.setPortionUnit("Portionen");
        model.setTimeline("Bis zu 60 Minuten");
        model.setDifficulty("Easy");
        model.setMatchingPercentage("90");
        data.add(model);

        model.setId("8777b58e-2db1-4e1d-803b-7ecb7f4f9b4d");
        model.setImageUrl("https://media.kaufland.de/images/PPIM/AP_Content_2708/std.lang.all/81/19/Asset_818119.jpg");
        model.setRecipeId("DE_2805");
        model.setRecipeName("Grüner Spargel mit Kartoffelspießen");
        model.setPortionCount("4");
        model.setPortionUnit("Portionen");
        model.setTimeline("Bis zu 70 Minuten");
        model.setDifficulty("Medium");
        model.setMatchingPercentage("75");
        data.add(model);

        model.setId("38d7d353-c2f5-4c05-846c-79452d10f4f8");
        model.setImageUrl("https://media.kaufland.de/images/PPIM/AP_Content_2708/std.lang.all/78/82/Asset_817882.jpg");
        model.setRecipeId("DE_1186");
        model.setRecipeName("Spaghetti mit Forellen-Spargel-Sauce");
        model.setPortionCount("2");
        model.setPortionUnit("Portionen");
        model.setTimeline("Bis zu 50 Minuten");
        model.setDifficulty("Easy");
        model.setMatchingPercentage("60");
        data.add(model);

        model.setId("fa56d6b2-39ab-40a4-8244-954d414fa46d");
        model.setImageUrl("https://media.kaufland.de/images/PPIM/AP_Content_2708/std.lang.all/83/61/Asset_818361.jpg");
        model.setRecipeId("DE_4030");
        model.setRecipeName("Spargel mit Orangen-Joghurtsoße");
        model.setPortionCount("3");
        model.setPortionUnit("Portionen");
        model.setTimeline("Bis zu 70 Minuten");
        model.setDifficulty("Easy");
        model.setMatchingPercentage("60");
        data.add(model);

        model.setId("fa56d6b2-39ab-40a4-8244-954d414fa46d");
        model.setImageUrl("https://media.kaufland.de/images/PPIM/AP_Content_2708/std.lang.all/83/61/Asset_818361.jpg");
        model.setRecipeId("DE_4120");
        model.setRecipeName("Spargel mit Orangen-Joghurtsoße");
        model.setPortionCount("3");
        model.setPortionUnit("Portionen");
        model.setTimeline("Bis zu 70 Minuten");
        model.setDifficulty("Easy");
        model.setMatchingPercentage("60");
        data.add(model);

        model.setId("7eb48d70-d197-4155-8a95-d25de70c3b8e");
        model.setImageUrl("https://media.kaufland.de/images/PPIM/AP_Content_2708/std.lang.all/81/50/Asset_818150.jpg");
        model.setRecipeId("DE_2999");
        model.setRecipeName("Viktoriabarschfilet mit Spargel");
        model.setPortionCount("4");
        model.setPortionUnit("Portionen");
        model.setTimeline("Bis zu 80 Minuten");
        model.setDifficulty("Easy");
        model.setMatchingPercentage("45");
        data.add(model);
    }
}
