package EvozonJavaBasics.AnimalRescue;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Dog doggy = new Dog("Bobby", 3, 8, 6, 9, "food", "activity");
        WetAnimalFood food = new WetAnimalFood("Conserva", 20, 100, LocalDate.of(2025, 11, 20), true);
        System.out.println("Health: " + doggy.getHealthLevel() + ", hunger: " + doggy.getHungerLevel());
        doggy.eat(food);
        System.out.println("Health: " + doggy.getHealthLevel() + ", hunger: " + doggy.getHungerLevel());
    }
}
