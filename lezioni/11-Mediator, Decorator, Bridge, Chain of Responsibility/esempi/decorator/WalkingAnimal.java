public class WalkingAnimal extends MovingAnimal {
    WalkingAnimal(Animal animal) {
        super(animal);
    }

    @Override
    public boolean can(Action action) {
        return action == Action.WALK ? true : animal.can(action);
    }
}
