package pay;

public class main {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        Checkout order1 = new Checkout(payPal);
        order1.processOrder(100);

        Checkout order2 = new Checkout(new CreditCard());
        order2.processOrder(100);
    }
}
