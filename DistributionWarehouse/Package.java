package EvozonJavaBasics.DistributionWarehouse;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Package {
    private Product product;
    private int numberOfUnits;
    private LocalDate entryDate;
    private LocalDate expirationDate;

    public Package (Product product, int numberOfUnits, LocalDate entryDate, LocalDate expirationDate) {
        this.product = product;
        this.numberOfUnits = numberOfUnits;
        this.entryDate = entryDate;
        this.expirationDate = expirationDate;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getNumberOfUnits() {
        return numberOfUnits;
    }
    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }
    public LocalDate getEntryDate() {
        return entryDate;
    }
    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }
    public LocalDate getExpirationDate() {
        return expirationDate;
    }
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    // How many times the discount applies to the product
    public int getDiscountsNumber(LocalDate currentDate) {
        // "Other" Category doesn't have discounts
        if (this.product.getCategory().equals("Other"))
            return 0;

        // Can't apply discounts if the product has expired already    
        if (currentDate.isAfter(this.expirationDate))
            return 0;
        
        long weeksBetween = ChronoUnit.WEEKS.between(currentDate, this.expirationDate);
        int discountsNumber = 0; // how many times we should apply the discount

        // Different logic for fruits and vegetables
        if (this.product.getCategory().equals("Fruits")) {
            if (weeksBetween <= 5)
                discountsNumber = 5 - (int) weeksBetween + 1;
        }
        else if (this.product.getCategory().equals("Vegetables")) {
            if (weeksBetween <= 4)
                discountsNumber = 4 - (int) weeksBetween + 1;
        }

        return discountsNumber;
    }

    // The overall percentage of the discount applied 
    public float computeDiscountPercentage(LocalDate currentDate) {
        if (this.product.getCategory().equals("Other")) // the "Other" category doesn't have discounts
            return 0;

        int discountsNumber = this.getDiscountsNumber(currentDate);
        int percentage = 0;
        if (this.product.getCategory().equals("Fruits"))
            percentage = 10;
        else if(this.product.getCategory().equals("Vegetables"))
            percentage = 5;

        float result = ((float) 1 - (float) Math.pow(1 - (float) percentage / 100, discountsNumber)) * 100; // formula for computing the overall procentage
        return result;
    }

    // The numerical value of the discount which will be subtracted from the total price
    public float computeDiscount(LocalDate currentDate) {
        int discountsNumber = this.getDiscountsNumber(currentDate);

        int percentage = 0;
        if (this.product.getCategory().equals("Fruits"))
            percentage = 10;
        else if (this.product.getCategory().equals("Vegetables"))
            percentage = 5;

        float discountValue = 0;
        float currentPrice = this.product.getPricePerUnit() * this.numberOfUnits;
        for (int i = 1; i <= discountsNumber; i++) {
            float valueToSubtract = percentage * currentPrice / (float) 100;
            discountValue += valueToSubtract;
            currentPrice -= valueToSubtract;
        }

        return discountValue;
    }

    public float totalPrice(LocalDate currentDate) {
        float price = this.product.getPricePerUnit() * this.numberOfUnits;
        float discount = this.computeDiscount(currentDate);
        return price - discount;
    }

    public boolean isAvailable(LocalDate currentDate) {
        if (currentDate.isAfter(this.expirationDate))
            return false;
        
        return true;
    }

    public float unitsInKg() {
        return this.numberOfUnits * this.product.getKgPerUnit();
    }
}
