package pay;

public class Checkout {
    private PaymentMethod paymentMethod;

    public Checkout(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processOrder(double amount){
        paymentMethod.pay(amount);
    }
}
