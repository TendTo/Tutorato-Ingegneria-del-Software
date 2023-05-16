public class Fridge extends Appliance {
    public Fridge(int consumption) {
        super(consumption);
    }

    @Override
    public void use() {
        if (getIsOn())
            System.out.println("Cool");
    }
}
