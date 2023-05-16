public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid();

        Light light = new Light(10);
        Fan fan = new Fan(20);
        grid.addAppliance(fan);
        grid.addAppliance(light);

        Meter meter = new Meter(grid);
        grid.setMeter(meter);

        Button button = new Button(grid);
        Switch switcher = new Switch(grid);


        light.use();
        fan.use();

        button.turnOn();
        switcher.turnOn();

        light.use();
        fan.use();

        grid.updateAll();

        System.out.println("Meter reading: " + meter.getReading());

        meter.turnOff();

        grid.updateAll();

        System.out.println("Meter reading: " + meter.getReading());
    }
}
