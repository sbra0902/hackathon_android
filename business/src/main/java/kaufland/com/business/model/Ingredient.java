package kaufland.com.business.model;

//[SerializePropertyNamesAsCamelCase]
public class Ingredient {
    //[JsonProperty("name")]
    public String name;

    //[JsonProperty("quantity")]
    public String quantity;

    //[JsonProperty("quantityTo")]
    public String quantityTo;

    //[JsonProperty("seperator")]
    public boolean seperator;

    //[JsonProperty("unit")]
    public String unit;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantityTo() {
        return quantityTo;
    }

    public void setQuantityTo(String quantityTo) {
        this.quantityTo = quantityTo;
    }

    public boolean isSeperator() {
        return seperator;
    }

    public void setSeperator(boolean seperator) {
        this.seperator = seperator;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
