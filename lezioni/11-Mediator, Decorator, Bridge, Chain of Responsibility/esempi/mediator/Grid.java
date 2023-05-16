import java.util.List;
import java.util.ArrayList;

public class Grid {
    private List<Appliance> appliances = new ArrayList<Appliance>();
    private Meter meter;

    public Meter getMeter() {
        return meter;
    }

    public void setMeter(Meter meter) {
        this.meter = meter;
    }

    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }

    public void turnOnAll() {
        appliances.forEach(a -> a.turnOn());
    }

    public void turnOffAll() {
        appliances.forEach(a -> a.turnOff());
    }

    public void updateAll() {
        for (Appliance a : appliances) {
            int reading = a.readConsumption();
            meter.updateMeter(reading);
        }
    }

    public void turnOn(String appliance) {
        appliances.stream()
                .filter(a -> a.getClass().getName().equals(appliance))
                .forEach(a -> a.turnOn());
    }

    public void turnOff(String appliance) {
        appliances.stream()
                .filter(a -> a.getClass().getName().equals(appliance))
                .forEach(a -> a.turnOff());
    }
}