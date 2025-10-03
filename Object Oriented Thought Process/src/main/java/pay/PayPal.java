package pay;

public class PayPal implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("pay from paypal "+amount);
    }
}
