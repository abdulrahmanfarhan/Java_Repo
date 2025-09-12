package pay;

public class CreditCard implements paymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Pay from credit " + amount);
    }
}
