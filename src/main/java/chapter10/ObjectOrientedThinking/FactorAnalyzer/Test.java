package chapter10.ObjectOrientedThinking.FactorAnalyzer;

import java.util.Scanner;

/**
 *
 * @author Abdulrahman
 */
public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the even number");
        FactorAnalyzer f = new FactorAnalyzer();
        f.setValue(s.nextInt()).printArray(f.getPrimeFactors());
    }
}
