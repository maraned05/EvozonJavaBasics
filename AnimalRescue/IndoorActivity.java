package EvozonJavaBasics.AnimalRescue;

public class IndoorActivity extends RecreationalActivity {
    public IndoorActivity() {
        super();
    }

    public IndoorActivity(String _name) {
        super(_name);
    }

    @Override
    public String getDetails() {
        return this.name + " takes place indoors!";
    }
}
