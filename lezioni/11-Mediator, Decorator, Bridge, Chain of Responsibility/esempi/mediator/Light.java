public class Light extends Appliance {
    public Light(int consumption) {
        super(consumption);
    }

    @Override
    public void use() {
        if (getIsOn())
            System.out.println("Light");
    }
}
