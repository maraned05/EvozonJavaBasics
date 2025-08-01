package EvozonJavaBasics.AnimalRescue;

import java.time.LocalDate;

public class AnimalFood {
    private String name;
    private int price;
    private int quantity;
    private LocalDate expirationDate;
    private boolean isAvailable;

    public AnimalFood(String _name, int _price, int _quantity, LocalDate _expirationDate, boolean _isAvailable) {
        this.name = _name;
        this.price = _price;
        this.quantity = _quantity;
        this.expirationDate = _expirationDate;
        this.isAvailable = _isAvailable;
    }
}
