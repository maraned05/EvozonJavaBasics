package EvozonJavaBasics.AnimalRescue;

public abstract class Adopter {
    protected String name;
    protected int availableBudget;
    protected Animal adoptedAnimal = null;

    public Adopter() {
        
    }

    public Adopter(String _name, int _availableBudget) {
        this.name = _name;
        this.availableBudget = _availableBudget;
    }

    public abstract String getTitle();

    public abstract void adoptAnimal(Animal animal);

    public void nameAnimal(Animal animal, String name) {
        animal.setName(name);
    }

    public void feedAnimal(Animal animal, AnimalFood food) {
        animal.eat(food);
    }

    public void spendTimeWithAnimal(Animal animal, RecreationalActivity activity) {
        if (activity.getName().equals("fetching")) // fetching the ball requires more energy
            animal.setWeight(animal.getWeight() - 2);
        else
            animal.setWeight(animal.getWeight() - 1);

        animal.setMoodLevel(Math.min(animal.getMoodLevel() + 1, 10));
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

    public Animal getAdoptedAnimal() {
        return adoptedAnimal;
    }

    public void setAdoptedAnimal(Animal adoptedAnimal) {
        this.adoptedAnimal = adoptedAnimal;
    }
}   