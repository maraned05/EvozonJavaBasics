package EvozonJavaBasics.AnimalRescue;

public class Shelter {
    private int id;
    private int capacity;
    private Janitor janitor;

    public Shelter() {
        
    }

    public Shelter(int _id, int _capacity, Janitor _janitor) {
        this.id = _id;
        this.capacity = _capacity;
        this.janitor = _janitor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Janitor getJanitor() {
        return janitor;
    }

    public void setJanitor(Janitor janitor) {
        this.janitor = janitor;
    }
}
