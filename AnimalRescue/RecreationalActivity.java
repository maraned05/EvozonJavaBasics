package EvozonJavaBasics.AnimalRescue;

public class RecreationalActivity {
    protected String name;

    public RecreationalActivity() {
        
    }

    public RecreationalActivity(String _name) {
        this.name = _name;
    }

    public String getDetails() {
        return this.name + " takes place anywhere!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
