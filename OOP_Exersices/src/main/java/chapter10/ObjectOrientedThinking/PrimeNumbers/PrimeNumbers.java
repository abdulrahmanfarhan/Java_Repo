package chapter10.ObjectOrientedThinking.PrimeNumbers;

import java.util.Scanner;

public class PrimeNumbers {

    private int number;

    public PrimeNumbers() {
        this(120);
    }

    public PrimeNumbers(int number) {
        setNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number >= 0) {
            this.number = number;
        } else {
            Scanner s = new Scanner(System.in);
            do {
                System.out.println("Invalid Enput!");
                System.out.print("Enter the number:");
                number = s.nextInt();
                System.out.println("");
            } while (number < 0);
            this.number = number;
        }
    }

    public StackOfInteger getThePrimeNum() {
        StackOfInteger s = new StackOfInteger();
        for (int i = 2; i < this.getNumber(); i++) {
            if (isPrime(i)) {
                s.push(i);
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

    public static void printArray(StackOfInteger s) {
        while (!s.empty()) {
            System.out.print("[");
            System.out.print(s.pop());
            System.out.println("]");
        }
    }
}
