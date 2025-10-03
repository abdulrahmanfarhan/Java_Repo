package pay;

public class CreditCard implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Pay from credit " + amount);
    }
}
