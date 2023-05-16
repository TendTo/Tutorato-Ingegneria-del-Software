public class SwimmingAnimal extends MovingAnimal {
    SwimmingAnimal(Animal animal) {
        super(animal);
    }

    @Override
    public boolean can(Action action) {
        return action == Action.SWIM ? true : animal.can(action);
    }
}
