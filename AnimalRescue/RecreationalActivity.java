package EvozonJavaBasics.AnimalRescue;

public abstract class RecreationalActivity {
    protected String name;

    public RecreationalActivity() {
        
    }

    public RecreationalActivity(String _name) {
        this.name = _name;
    }

    public abstract String getDetails();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
