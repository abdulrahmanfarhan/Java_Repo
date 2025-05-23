package chapter10.ObjectOrientedThinking.PrimeNumbers;

/**
 *
 * @author Abdulrahman
 */
public class Test {
    public static void main(String[] args) {
        PrimeNumbers p = new PrimeNumbers(-50);
        PrimeNumbers.printArray(p.getThePrimeNum());
    }
}
