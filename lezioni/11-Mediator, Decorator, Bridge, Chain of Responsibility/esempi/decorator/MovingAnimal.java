public class MovingAnimal extends Animal {
    protected final Animal animal;

    MovingAnimal() {
        this.animal = new Animal();
    }

    MovingAnimal(Animal animal) {
        this.animal = animal;
    }
}
