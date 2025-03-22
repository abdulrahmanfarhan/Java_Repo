package chapter9.objects_classes.Stocks;

/**
 *
 * @author Abdulrahman_Farhan
 */
public class TestStock {

    public static void main(String[] args) {
        stock s1 = new stock("ORCL", "Oracle Corporation");

        s1.setPreviousClosingPrice(34.5);
        s1.setCurrentPrice(34.35);

        double s1Change = s1.getChangePercent();
        System.out.println("The Change of Stock #Name (" + s1.getName() + ") #symbol (" + s1.getSymbol() + ") is: " + s1.getChangePercent());
    }
}
