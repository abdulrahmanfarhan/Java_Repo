package pay;

public class Checkout {
    private paymentMethod paymentMethod;

    public Checkout(paymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processOrder(double amount){
        paymentMethod.pay(amount);
    }
}
