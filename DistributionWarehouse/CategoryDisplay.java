package EvozonJavaBasics.DistributionWarehouse;

public class CategoryDisplay {
    private double totalBaseUnits; // for Fruits/Vegetables will be total of kg, for Other will be total of packs
    private double totalPrice;

    public CategoryDisplay() {
        this.totalBaseUnits = 0;
        this.totalPrice = 0;
    }

    public double getTotalBaseUnits() {
        return totalBaseUnits;
    }
    public void setTotalBaseUnits(double totalBaseUnits) {
        this.totalBaseUnits = totalBaseUnits;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
