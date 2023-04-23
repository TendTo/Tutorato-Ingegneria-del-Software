public class CreditCard implements PaymentMethod {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay() {
        System.out.println("Contacting bank...");
        System.out.println("Paying with credit card " + cardNumber + "...");
    }
}
