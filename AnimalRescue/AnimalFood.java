package EvozonJavaBasics.AnimalRescue;

import java.time.LocalDate;

public class AnimalFood {
    protected String name;
    protected int price;
    protected int quantity;
    protected LocalDate expirationDate;
    protected boolean isAvailable;

    public AnimalFood() {
        
    }

    public AnimalFood(String _name, int _price, int _quantity, LocalDate _expirationDate, boolean _isAvailable) {
        this.name = _name;
        this.price = _price;
        this.quantity = _quantity;
        this.expirationDate = _expirationDate;
        this.isAvailable = _isAvailable;
    }

    public int getTotalPrice() {
        return this.price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
