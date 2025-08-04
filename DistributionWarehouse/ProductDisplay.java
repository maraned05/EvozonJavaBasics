package EvozonJavaBasics.DistributionWarehouse;

public class ProductDisplay {
    private int noOfPackages;
    private double noOfBaseUnits; // for Fruits/Vegetables will be total of kg, for Other will be total of packs
    private float pricePerUnit;
    private double totalPrice;
    private float averageDiscount;

    public ProductDisplay() {
        this.noOfPackages = 0;
        this.noOfBaseUnits = 0;
        this.pricePerUnit = 0;
        this.totalPrice = 0;
        this.averageDiscount = 0;
    }

    public int getNoOfPackages() {
        return noOfPackages;
    }
    public void setNoOfPackages(int packages) {
        this.noOfPackages = packages;
    }
    public double getNoOfBaseUnits() {
        return noOfBaseUnits;
    }
    public void setNoOfBaseUnits(double noOfBaseUnits) {
        this.noOfBaseUnits = noOfBaseUnits;
    }
    public float getPricePerUnit() {
        return pricePerUnit;
    }
    public void setPricePerUnit(float pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public float getAverageDiscount() {
        return averageDiscount;
    }
    public void setAverageDiscount(float averageDiscount) {
        this.averageDiscount = averageDiscount;
    }
}
