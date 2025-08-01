package EvozonJavaBasics.AnimalRescue;

public class Volunteer {
    private int id;
    private String name;
    private int hoursWorked;

    public Volunteer() {
        
    }

    public Volunteer(int _id, String _name, int _hoursWorked) {
        this.id = _id;
        this.name = _name;
        this.hoursWorked = _hoursWorked;
    }

    public void takeCareOfAnimal(Animal animal) {
        if (animal.getHealthLevel() < 6)
            this.hoursWorked += 5;
        else 
            this.hoursWorked += 2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
