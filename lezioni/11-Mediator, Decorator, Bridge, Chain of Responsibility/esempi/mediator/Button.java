public class Button {
    private Grid grid;

    Button(Grid grid) {
        this.grid = grid;
    }

    public void turnOn() {
        grid.turnOn("Fan");
    }

    public void turnOff() {
        grid.turnOff("Fan");
    }
}