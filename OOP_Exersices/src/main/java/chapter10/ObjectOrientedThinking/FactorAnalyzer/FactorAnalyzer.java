package chapter10.ObjectOrientedThinking.FactorAnalyzer;

/**
 *
 * @author Abdulrahman
 */
public class FactorAnalyzer {

    private int value;

    public FactorAnalyzer() {
    }

    public int getValue() {
        return value;
    }

    public FactorAnalyzer setValue(int value) {
        if (value > 0 && value % 2 == 0) {
            this.value = value;
        } else {
            System.out.println("Invalid input!");
        }
        return this;
    }

    public StackOfIntegers getPrimeFactors() {
        int tempV = this.getValue();
        StackOfIntegers s = new StackOfIntegers();
        for (int i = 2; i <= tempV; i++) {
            if (isPrime(i)) {
                while (tempV % i == 0) {
                    s.push(i);
                    tempV /= i;
                }
            }
        }
        return s;
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        } else if (n <= 1 || n % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void printArray(StackOfIntegers s) {
        System.out.print("[");
        while (!s.empty()) {
            System.out.print(s.pop());
            if (!s.empty()) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}
