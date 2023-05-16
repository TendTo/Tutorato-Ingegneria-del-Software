public abstract class Appliance {
    private final int consumption;
    private boolean isOn;

    public Appliance(int consumption) {
        this.consumption = consumption;
        this.isOn = false;
    }

    public int getConsumption() {
        return consumption;
    }

    public int readConsumption() {
        return isOn ? consumption : 0;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public abstract void use();
}
