package EvozonJavaBasics.AnimalRescue;

public class Veterinarian {
    private String name;
    private String specialization;

    public Veterinarian() {
        
    }

    public Veterinarian(String _name, String _specialization) {
        this.name = _name;
        this.specialization = _specialization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
