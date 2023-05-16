public class Fan extends Appliance {
    public Fan(int consumption) {
        super(consumption);
    }

    @Override
    public void use() {
        if (getIsOn())
            System.out.println("Wind");
    }
}
