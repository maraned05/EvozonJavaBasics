package EvozonJavaBasics.AnimalRescue;

import java.time.LocalDate;

public class DryAnimalFood extends AnimalFood {
    public DryAnimalFood() {
        super();
    }

    public DryAnimalFood(String _name, int _price, int _quantity, LocalDate _expirationDate, boolean _isAvailable) {
        super(_name, _price, _quantity, _expirationDate, _isAvailable);
    } 

    @Override
    public int getTotalPrice() {
        return this.price + 10;
    }
}