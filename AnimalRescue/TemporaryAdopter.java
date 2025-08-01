package EvozonJavaBasics.AnimalRescue;

public class TemporaryAdopter extends Adopter{
    public TemporaryAdopter() {
        super();
    }

    public TemporaryAdopter(String _name, int _availableBudget) {
        super(_name, _availableBudget);
    }

    @Override
    public String getTitle() {
        return "Temporary Adopter " + this.name;
    }
}
