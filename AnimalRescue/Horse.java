package EvozonJavaBasics.AnimalRescue;

public class Horse extends Animal {
    public Horse() {
        super();
    }

    public Horse(String _name, int _age, int _weight, int _healthLevel, int _hungerLevel, int _moodLevel, String _favouriteFood, String _favouriteActivity) {
        super(_name, _age, _weight,  _healthLevel, _hungerLevel, _moodLevel, _favouriteFood, _favouriteActivity);
    }  

    @Override
    public void speak() {
        System.out.println("Some horse sound idk!");
    }
}
