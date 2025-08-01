package EvozonJavaBasics.AnimalRescue;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        PermanentAdopter fetita = new PermanentAdopter("Fetita", 200);
        Dog labrador = new Dog("No-name", 1, 5, 2, 10, 1, "conserva", "fetch");

        System.out.println("Weight: " + labrador.getWeight() + ", health: " + labrador.getHealthLevel() + ", hunger: " + labrador.getHungerLevel() + ", mood: " + labrador.getMoodLevel());

        // The girl adopted and named the dog
        fetita.adoptAnimal(labrador);
        fetita.nameAnimal(labrador, "Nume frumos");

        // The girl fed and played with her dog
        WetAnimalFood food = new WetAnimalFood("conserva", 20, 10, LocalDate.of(2025, 11, 20), true);
        for (int i = 1; i <= 5; i++) {
            fetita.feedAnimal(labrador, food);
            System.out.println("Weight: " + labrador.getWeight() + ", health: " + labrador.getHealthLevel() + ", hunger: " + labrador.getHungerLevel() + ", mood: " + labrador.getMoodLevel());
        }

        // The veterinarian vaccinates the dog
        System.out.println("Dog goes to vaccination.");
        SeniorVeterinarian vet = new SeniorVeterinarian("Ioana", "Vaccination");
        vet.vaccinateAnimal(labrador);
        // A volunteer soothes the dog
        Volunteer volunteer = new Volunteer(1, "Alex", 20);
        volunteer.playWithAnimal(labrador);

        System.out.println("Weight: " + labrador.getWeight() + ", health: " + labrador.getHealthLevel() + ", hunger: " + labrador.getHungerLevel() + ", mood: " + labrador.getMoodLevel());

        // The girls starts feeding the animal with special food and follows a routine with him
        DryAnimalFood specialFood = new DryAnimalFood("bobite", 20, 500, LocalDate.of(2026, 5, 20), true);
        OutdoorActivity walking = new OutdoorActivity("walk");
        OutdoorActivity fetching = new OutdoorActivity("fetching");
        for (int i = 1; i <= 5; i++) {
            fetita.feedAnimal(labrador, specialFood);
            fetita.spendTimeWithAnimal(labrador, walking);
            labrador.sleeps();
            fetita.spendTimeWithAnimal(labrador, fetching);
            fetita.spendTimeWithAnimal(labrador, walking);
            fetita.feedAnimal(labrador, specialFood);
            labrador.sleeps();

            System.out.println("Weight: " + labrador.getWeight() + ", health: " + labrador.getHealthLevel() + ", hunger: " + labrador.getHungerLevel() + ", mood: " + labrador.getMoodLevel());
        }

    }
}
