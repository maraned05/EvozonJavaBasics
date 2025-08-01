package EvozonJavaBasics.AnimalRescue;

public class JuniorVeterinarian extends Veterinarian {
    public JuniorVeterinarian() {
        super();
    }

    public JuniorVeterinarian(String _name, String _specialization) {
        super(_name, _specialization);
    }

    public void stockMedicalSupply(MedicalSupplies supply) {
        int initialQty = supply.getQuantity();
        supply.setQuantity(initialQty + 5);
    }

    @Override
    public String getTitle() {
        return "Junior Veterinarian " + this.name;
    }
}
