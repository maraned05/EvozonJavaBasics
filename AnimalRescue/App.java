package EvozonJavaBasics.AnimalRescue;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal("Marcel", 2, 9, 3, 7, "Bobite", "Fetch");
        Adopter adopter = new Adopter("Ion", 300);
        AnimalFood food = new AnimalFood("Bobite", 20, 80, LocalDate.of(2025, 10, 9), true);
        RecreationalActivity activity = new RecreationalActivity("walking");
        Veterinarian veterinarian = new Veterinarian("John", "Cardiology");
        Game game = new Game(adopter, animal, veterinarian);
        Janitor janitor = new Janitor(1, "Vasile");
        Shelter shelter = new Shelter(1, 10, janitor);
        MedicalSupplies bandages = new MedicalSupplies("Bandages", 40, true);
        Volunteer volunteer = new Volunteer(1, "Mara", 30);
    }
}
