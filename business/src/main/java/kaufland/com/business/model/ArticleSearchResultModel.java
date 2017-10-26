package kaufland.com.business.model;

public class ArticleSearchResultModel {

    //[JsonProperty("id")]
    public String id;

    //[JsonProperty("brand")]
    public String brand;

    //[JsonProperty("name")]
    public String name;

    //[JsonProperty("weight")]
    public String weight;

    //[JsonProperty("rid")]
    public String rid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }
}
