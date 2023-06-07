public class User {
    private PaymentMethod paymentMethod;

    public void pay() {
        if (paymentMethod == null) {
            System.out.println("No payment method selected");
            return;
        }
        paymentMethod.pay();
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
}
