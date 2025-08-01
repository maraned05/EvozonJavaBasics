package EvozonJavaBasics.AnimalRescue;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        doggy.setAge(10);
        doggy.speak();

        Cat kitten = new Cat();
        kitten.setMoodLevel(3);
        kitten.speak();

        Horse horsy = new Horse();
        horsy.setHealthLevel(9);
        horsy.speak();

        DryAnimalFood bobite = new DryAnimalFood();
        bobite.setExpirationDate(LocalDate.of(2025, 11, 23));
        bobite.setPrice(20);
        System.out.println(bobite.getTotalPrice());

        WetAnimalFood conserva = new WetAnimalFood();
        conserva.setAvailable(true);
        conserva.setPrice(20);
        System.out.println(conserva.getTotalPrice());

        JuniorVeterinarian veterinarian1 = new JuniorVeterinarian();
        veterinarian1.setName("Ioana");
        System.out.println(veterinarian1.getTitle());

        SeniorVeterinarian veterinarian2 = new SeniorVeterinarian();
        veterinarian2.setSpecialization("ORL");
        veterinarian2.setName("Ioana");
        System.out.println(veterinarian2.getTitle());

        TemporaryAdopter adopter1 = new TemporaryAdopter();
        adopter1.setAvailableBudget(400);
        adopter1.setName("George");
        System.out.println(adopter1.getTitle());

        PermanentAdopter adopter2 = new PermanentAdopter();
        adopter2.setName("George");
        System.out.println(adopter2.getTitle());

        IndoorActivity activity1 = new IndoorActivity();
        activity1.setName("fetch");
        System.out.println(activity1.getDetails());

        OutdoorActivity activity2 = new OutdoorActivity();
        System.out.println(activity2.getDetails());
    }
}
