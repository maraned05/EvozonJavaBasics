package EvozonJavaBasics.AnimalRescue;

import java.time.LocalDate;

public class WetAnimalFood extends AnimalFood {
    public WetAnimalFood() {
        super();
    }

    public WetAnimalFood(String _name, int _price, int _quantity, LocalDate _expirationDate, boolean _isAvailable) {
        super(_name, _price, _quantity, _expirationDate, _isAvailable);
    } 
}
