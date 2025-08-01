package EvozonJavaBasics.AnimalRescue;

public class Animal {
    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int moodLevel;
    private String favouriteFood;
    private String favouriteActivity;

    public Animal (String _name, int _age, int _healthLevel, int _hungerLevel, int _moodLevel, String _favouriteFood, String _favouriteActivity) {
        this.name = _name;
        this.age = _age;
        this.healthLevel = _healthLevel;
        this.hungerLevel = _hungerLevel;
        this.moodLevel = _moodLevel;
        this.favouriteFood = _favouriteFood;
        this.favouriteActivity = _favouriteActivity;
    }
}
