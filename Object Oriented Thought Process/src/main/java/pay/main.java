package pay;

public class main {
    public static void main(String[] args) {
        Checkout order1 = new Checkout(new PayPal());
        order1.processOrder(100);

        Checkout order2 = new Checkout(new PayPal());
        order1.processOrder(100);
    }
}
