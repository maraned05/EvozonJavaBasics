package EvozonJavaBasics.DistributionWarehouse;

public class Product {
    private String category; // Fruits, Vegetables, Others
    private String name; // Apples, Potatoes, etc.
    private String unit; // Kg, Bag, etc.
    private float kgPerUnit;
    private float pricePerUnit;

    public Product(String category, String name, String unit, float kgPerUnit, float pricePerUnit) {
        this.category = category;
        this.name = name;
        this.unit = unit;
        this.kgPerUnit = kgPerUnit;
        this.pricePerUnit = pricePerUnit;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public float getKgPerUnit() {
        return kgPerUnit;
    }
    public void setKgPerUnit(float kgPerUnit) {
        this.kgPerUnit = kgPerUnit;
    }
    public float getPricePerUnit() {
        return pricePerUnit;
    }
    public void setPricePerUnit(float pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
