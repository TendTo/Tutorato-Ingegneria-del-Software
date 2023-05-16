
public class Switch {
    private Grid grid;

    Switch(Grid grid) {
        this.grid = grid;
    }

    public void turnOn() {
        grid.turnOn("Light");
    }

    public void turnOff() {
        grid.turnOff("Light");
    }
}
