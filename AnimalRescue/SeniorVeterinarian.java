package EvozonJavaBasics.AnimalRescue;

public class SeniorVeterinarian extends Veterinarian {
    public SeniorVeterinarian() {
        super();
    }

    public SeniorVeterinarian(String _name, String _specialization) {
        super(_name, _specialization);
    }

    @Override
    public String getTitle() {
        return "Senior Veterinarian " + this.name;
    }
}
