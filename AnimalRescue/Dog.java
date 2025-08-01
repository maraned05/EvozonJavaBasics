package EvozonJavaBasics.AnimalRescue;

public class Dog extends Animal {
    public Dog() {
        super();
    }

    public Dog(String _name, int _age, int _healthLevel, int _hungerLevel, int _moodLevel, String _favouriteFood, String _favouriteActivity) {
        super(_name, _age, _healthLevel, _hungerLevel, _moodLevel, _favouriteFood, _favouriteActivity);
    }    

    @Override
    public void speak() {
        System.out.println("Bark!");
    }
}
