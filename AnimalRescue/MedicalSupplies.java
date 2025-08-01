package EvozonJavaBasics.AnimalRescue;

public class MedicalSupplies {
    private String name;
    private int quantity;
    private boolean isAvailable;

    public MedicalSupplies() {
        
    }

    public MedicalSupplies(String _name, int _quantity, boolean _isAvailable) {
        this.name = _name;
        this.quantity = _quantity;
        this.isAvailable = _isAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
