package EvozonJavaBasics.AnimalRescue;

import java.time.LocalDate;

public abstract class Animal {
    protected String name;
    protected int age;
    protected int weight;
    protected int healthLevel;
    protected int hungerLevel;
    protected int moodLevel;
    protected String favouriteFood;
    protected String favouriteActivity;
    protected int shelterId = -1;
    protected boolean isAdopted =  false;

    public Animal() {
    }

    public Animal (String _name, int _age, int _weight, int _healthLevel, int _hungerLevel, int _moodLevel, String _favouriteFood, String _favouriteActivity) {
        this.name = _name;
        this.age = _age;
        this.weight = _weight;
        this.healthLevel = _healthLevel;
        this.hungerLevel = _hungerLevel;
        this.moodLevel = _moodLevel;
        this.favouriteFood = _favouriteFood;
        this.favouriteActivity = _favouriteActivity;
    }

    public abstract void speak();

    public void sleeps() {
        System.out.println("The dog sleeps.");
    }

    public void eat(AnimalFood food) {
        if (food.isAvailable() && food.getExpirationDate().isAfter(LocalDate.now())) {
            this.hungerLevel = Math.max(1, this.hungerLevel - 3);
            this.moodLevel = Math.min(this.moodLevel + 1, 10);
            this.healthLevel = Math.min(this.moodLevel + 1, 10);

            if (food instanceof WetAnimalFood)
                this.weight += 3;
            else 
                this.weight += 2;
        }
        else if (food.isAvailable() && food.getExpirationDate().isBefore(LocalDate.now()))
            this.healthLevel--;

        if (food.isAvailable())
            food.setQuantity(food.getQuantity() - 1);
    }

    public void assignShelter(Shelter shelter) {
        this.shelterId = shelter.getId();
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    public int getShelterId() {
        return shelterId;
    }

    public void setShelterId(int shelterId) {
        this.shelterId = shelterId;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public void setAdopted(boolean isAdopted) {
        this.isAdopted = isAdopted;
    }
}
