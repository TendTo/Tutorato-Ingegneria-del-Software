public class Meter {
    private int reading = 0;
    private Grid grid;

    Meter(Grid grid) {
        this.grid = grid;
    }

    public void turnOn() {
        grid.turnOnAll();
    }

    public void turnOff() {
        grid.turnOffAll();
    }

    public void updateMeter(int reading) {
        this.reading += reading;
    }

    public int getReading() {
        return reading;
    }
}
