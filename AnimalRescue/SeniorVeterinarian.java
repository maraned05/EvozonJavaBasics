package EvozonJavaBasics.AnimalRescue;

public class SeniorVeterinarian extends Veterinarian {
    public SeniorVeterinarian() {
        super();
    }

    public SeniorVeterinarian(String _name, String _specialization) {
        super(_name, _specialization);
    }

    public void stockMedicalSupply(MedicalSupplies supply) {
        int initialQty = supply.getQuantity();
        supply.setQuantity(initialQty + 10);
    }

    @Override
    public String getTitle() {
        return "Senior Veterinarian " + this.name;
    }
}
