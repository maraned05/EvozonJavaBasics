package EvozonJavaBasics.AnimalRescue;

public abstract class Adopter {
    protected String name;
    protected int availableBudget;

    public Adopter() {
        
    }

    public Adopter(String _name, int _availableBudget) {
        this.name = _name;
        this.availableBudget = _availableBudget;
    }

    public abstract String getTitle();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailableBudget() {
        return availableBudget;
    }

    public void setAvailableBudget(int availableBudget) {
        this.availableBudget = availableBudget;
    }
}   