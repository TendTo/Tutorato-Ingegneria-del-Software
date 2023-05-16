public class DeadAnimal extends MovingAnimal {
    DeadAnimal(Animal animal) {
        super(animal);
    }

    @Override
    public boolean can(Action action) {
        return false;
    }
}
