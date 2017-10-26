package main.java.kaufland.com.business.model;


import java.util.List;

//[SerializePropertyNamesAsCamelCase]
public class RecipeSearchResultModel {
    //[JsonProperty("id")]
    public String id;

    //[JsonProperty("category")]
    public String[] category;

    //[JsonProperty("cooking")]
    public String[] cooking;

    //[JsonProperty("copyrightPhoto")]
    public String copyrightPhoto;

    //[JsonProperty("country")]
    public String country;

    //[JsonProperty("difficulty")]
    public String difficulty;

    //[JsonProperty("imageUrl")]
    public String imageUrl;

    //[JsonProperty("ingredients")]
    public List<Object/* dynamic ??? */> ingredients;

    //[JsonProperty("portionCount")]
    public String portionCount;

    //[JsonProperty("portionUnit")]
    public String portionUnit;

    //[JsonProperty("recipeId")]
    public String recipeId;

    //[JsonProperty("recipeName")]
    public String recipeName;

    //[JsonProperty("searchKeywords")]
    public String searchKeywords;

    //[JsonProperty("timeline")]
    public String timeline;

    //[JsonProperty("tip")]
    public String tip;

    //[JsonProperty("type")]
    public String type;

    //[JsonProperty("updatedAt")]
    public String updatedAt;

    //[JsonProperty("videoUrl")]
    public String videoUrl;

    //[JsonProperty("rid")]
    public String rid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public String[] getCooking() {
        return cooking;
    }

    public void setCooking(String[] cooking) {
        this.cooking = cooking;
    }

    public String getCopyrightPhoto() {
        return copyrightPhoto;
    }

    public void setCopyrightPhoto(String copyrightPhoto) {
        this.copyrightPhoto = copyrightPhoto;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Object> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Object> ingredients) {
        this.ingredients = ingredients;
    }

    public String getPortionCount() {
        return portionCount;
    }

    public void setPortionCount(String portionCount) {
        this.portionCount = portionCount;
    }

    public String getPortionUnit() {
        return portionUnit;
    }

    public void setPortionUnit(String portionUnit) {
        this.portionUnit = portionUnit;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getSearchKeywords() {
        return searchKeywords;
    }

    public void setSearchKeywords(String searchKeywords) {
        this.searchKeywords = searchKeywords;
    }

    public String getTimeline() {
        return timeline;
    }

    public void setTimeline(String timeline) {
        this.timeline = timeline;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }
}
