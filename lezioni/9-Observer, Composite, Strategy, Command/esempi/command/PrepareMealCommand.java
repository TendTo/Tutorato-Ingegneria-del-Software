public abstract class PrepareMealCommand implements Command {
    protected Kitchen kitchen;

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
}
