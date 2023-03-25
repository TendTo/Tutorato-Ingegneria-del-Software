package entity;

public class LightSwitch extends Entity implements Interactable {
    boolean isOn = false;

    public LightSwitch() {
        super("Light Switch");
    }

    @Override
    public void interact() {
        System.out.println("You flip the switch.");
        isOn = !isOn;
    }

    public boolean isOn() {
        return isOn;
    }
}
