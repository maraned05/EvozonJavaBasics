package EvozonJavaBasics.AnimalRescue;

public class OutdoorActivity extends RecreationalActivity {
    public OutdoorActivity() {
        super();
    }

    public OutdoorActivity(String _name) {
        super(_name);
    }

    @Override
    public String getDetails() {
        return this.name + " takes place outdoors!";
    }
}
