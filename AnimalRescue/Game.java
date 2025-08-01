package EvozonJavaBasics.AnimalRescue;

public class Game {
    private Adopter adopter;
    private Animal dog;
    private Veterinarian veterinarian;

    public Game() {
        
    }

    public Game(Adopter _adopter, Animal _dog, Veterinarian _veterinarian) {
        this.adopter = _adopter;
        this.dog = _dog;
        this.veterinarian = _veterinarian;
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Animal getDog() {
        return dog;
    }

    public void setDog(Animal dog) {
        this.dog = dog;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }
}
