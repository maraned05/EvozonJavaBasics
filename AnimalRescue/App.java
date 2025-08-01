package EvozonJavaBasics.AnimalRescue;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Marcel");
        animal.setAge(2);
        animal.setHealthLevel(9);
        animal.setHungerLevel(3);
        animal.setMoodLevel(7);
        animal.setFavouriteFood("Bobite");
        animal.setFavouriteActivity("Fetch");

        Adopter adopter = new Adopter();
        adopter.setName("Ion");
        adopter.setAvailableBudget(300);

        AnimalFood food = new AnimalFood();
        food.setName("Bobite");
        food.setPrice(20);
        food.setQuantity(80);
        food.setExpirationDate(LocalDate.of(2025, 10, 9));
        food.setAvailable(true);

        RecreationalActivity activity = new RecreationalActivity();
        activity.setName("walking");

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("John");
        veterinarian.setSpecialization("Cardiology");

        Game game = new Game();
        game.setAdopter(adopter);
        game.setDog(animal);
        game.setVeterinarian(veterinarian);

        Janitor janitor = new Janitor();
        janitor.setId(1);
        janitor.setName("Vasile");

        Shelter shelter = new Shelter();
        shelter.setId(1);
        shelter.setCapacity(10);
        shelter.setJanitor(janitor);

        MedicalSupplies bandages = new MedicalSupplies();
        bandages.setName("Bandages");
        bandages.setQuantity(40);
        bandages.setAvailable(true);

        Volunteer volunteer = new Volunteer();
        volunteer.setId(1);
        volunteer.setName("Mara");
        volunteer.setHoursWorked(30);
    }
}
