public class FlyingAnimal extends MovingAnimal {
    FlyingAnimal(Animal animal) {
        super(animal);
    }

    public boolean can(Action action) {
        return action == Action.FLY ? true : animal.can(action);
    }
}
