package EvozonJavaBasics.AnimalRescue;

public class Game {
    private Adopter adopter;
    private Animal dog;
    private Veterinarian veterinarian;

    public Game(Adopter _adopter, Animal _dog, Veterinarian _veterinarian) {
        this.adopter = _adopter;
        this.dog = _dog;
        this.veterinarian = _veterinarian;
    }
}
