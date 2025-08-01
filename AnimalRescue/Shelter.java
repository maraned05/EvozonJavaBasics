package EvozonJavaBasics.AnimalRescue;

public class Shelter {
    private int id;
    private int capacity;
    private Janitor janitor;

    public Shelter(int _id, int _capacity, Janitor _janitor) {
        this.id = _id;
        this.capacity = _capacity;
        this.janitor = _janitor;
    }
}
