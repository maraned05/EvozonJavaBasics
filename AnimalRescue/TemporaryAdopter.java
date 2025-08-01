package EvozonJavaBasics.AnimalRescue;

public class TemporaryAdopter extends Adopter{
    private int adoptionDuration = 0;

    public TemporaryAdopter() {
        super();
    }

    public TemporaryAdopter(String _name, int _availableBudget) {
        super(_name, _availableBudget);
    }

    public int getAdoptionDuration() {
        return adoptionDuration;
    }

    public void setAdoptionDuration(int adoptionDuration) {
        this.adoptionDuration = adoptionDuration;
    }

    @Override
    public String getTitle() {
        return "Temporary Adopter " + this.name;
    }

    @Override
    public void adoptAnimal(Animal animal) {
        if (animal.getHealthLevel() < 5)
            this.adoptionDuration = 30;
        else
            this.adoptionDuration = 10;

        this.adoptedAnimal = animal;
        animal.setAdopted(true);
    }
}
