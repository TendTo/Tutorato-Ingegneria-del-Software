public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setPaymentMethod(new Cash());
        user.pay();

        user.setPaymentMethod(new CreditCard("1234567890123456"));
        user.pay();
    }
}
