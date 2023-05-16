public class Animal implements IAnimal {
    @Override
    public boolean can(Action action) {
        return action == Action.EAT || action == Action.SLEEP;
    }
}
