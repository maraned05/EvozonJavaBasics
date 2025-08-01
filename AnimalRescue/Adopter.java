package EvozonJavaBasics.AnimalRescue;

public class Adopter {
    private String name;
    private int availableBudget;

    public Adopter() {
        
    }

    public Adopter(String _name, int _availableBudget) {
        this.name = _name;
        this.availableBudget = _availableBudget;
    }

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