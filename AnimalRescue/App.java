package EvozonJavaBasics.AnimalRescue;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.setAge(10);

        Cat kitten = new Cat();
        kitten.setMoodLevel(3);

        Horse horsy = new Horse();
        horsy.setHealthLevel(9);

        DryAnimalFood bobite = new DryAnimalFood();
        bobite.setExpirationDate(LocalDate.of(2025, 11, 23));

        WetAnimalFood conserva = new WetAnimalFood();
        conserva.setAvailable(true);

        JuniorVeterinarian veterinarian1 = new JuniorVeterinarian();
        veterinarian1.setName("Ioana");

        SeniorVeterinarian veterinarian2 = new SeniorVeterinarian();
        veterinarian2.setSpecialization("ORL");

        TemporaryAdopter adopter1 = new TemporaryAdopter();
        adopter1.setAvailableBudget(400);

        PermanentAdopter adopter2 = new PermanentAdopter();
        adopter2.setName("George");

        IndoorActivity activity1 = new IndoorActivity();
        activity1.setName("fetch");

        OutdoorActivity activity2 = new OutdoorActivity();
        activity2.setName("walk");
    }
}
