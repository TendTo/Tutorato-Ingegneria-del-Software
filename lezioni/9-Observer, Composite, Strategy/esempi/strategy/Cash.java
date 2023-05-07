public class Cash implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Will pay with cash at the door");
    }
}
