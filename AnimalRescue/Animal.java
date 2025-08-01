package EvozonJavaBasics.AnimalRescue;

public class Animal {
    protected String name;
    protected int age;
    protected int healthLevel;
    protected int hungerLevel;
    protected int moodLevel;
    protected String favouriteFood;
    protected String favouriteActivity;

    public Animal() {
        
    }

    public Animal (String _name, int _age, int _healthLevel, int _hungerLevel, int _moodLevel, String _favouriteFood, String _favouriteActivity) {
        this.name = _name;
        this.age = _age;
        this.healthLevel = _healthLevel;
        this.hungerLevel = _hungerLevel;
        this.moodLevel = _moodLevel;
        this.favouriteFood = _favouriteFood;
        this.favouriteActivity = _favouriteActivity;
    }

    public void speak() {
        System.out.println("The animal speaks.");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int _age) {
        this.age = _age;
    }

    public int getHealthLevel() {
        return this.healthLevel;
    }

    public void setHealthLevel(int _healthLevel) {
        this.healthLevel = _healthLevel;
    }

    public int getHungerLevel() {
        return this.hungerLevel;
    }

    public void setHungerLevel(int _hungerLevel) {
        this.hungerLevel = _hungerLevel;
    }

    public int getMoodLevel() {
        return this.moodLevel;
    }

    public void setMoodLevel(int _moodLevel) {
        this.moodLevel = _moodLevel;
    }

    public String getFavouriteFood() {
        return this.favouriteFood;
    }

    public void setFavouriteFood(String _favouriteFood) {
        this.favouriteFood = _favouriteFood;
    }

    public String getFavouriteActivity() {
        return this.favouriteActivity;
    }

    public void setFavouriteActivity(String _favouriteActivity) {
        this.favouriteActivity = _favouriteActivity;
    }
}
