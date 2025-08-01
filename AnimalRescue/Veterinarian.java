package EvozonJavaBasics.AnimalRescue;

public abstract class Veterinarian {
    protected String name;
    protected String specialization;

    public Veterinarian() {
        
    }

    public Veterinarian(String _name, String _specialization) {
        this.name = _name;
        this.specialization = _specialization;
    }

    public abstract String getTitle();

    public abstract void stockMedicalSupply(MedicalSupplies supply);

    public void vaccinateAnimal(Animal animal) {
        animal.setMoodLevel(Math.max(animal.getMoodLevel() - 3, 1));
        animal.setHealthLevel(Math.min(animal.getHealthLevel() + 1, 10));
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
