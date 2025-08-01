package EvozonJavaBasics.AnimalRescue;

public class PermanentAdopter extends Adopter {
    public PermanentAdopter() {
        super();
    }

    public PermanentAdopter(String _name, int _availableBudget) {
        super(_name, _availableBudget);
    }

    @Override
    public String getTitle() {
        return "Permanent Adopter " + this.name;
    }

    @Override
    public void adoptAnimal(Animal animal) {
        this.adoptedAnimal = animal;
        animal.setAdopted(true);
    }
}
