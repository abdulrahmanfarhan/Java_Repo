package chapter12.ExceptionHandling.QuotientWithIf;

import java.util.Scanner;

public class QuotientWithIf {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number 1:");
        int n1 = s.nextInt();
        System.out.print("Enter the number 2:");
        int n2 = s.nextInt();
        try {
            System.out.println(quotient(n1, n2));
        } catch (ArithmeticException e) {
            System.out.println("an integer cannot be divided by zero");
        }
        System.out.println("The program will continue with exception......");

    }

    public static int quotient(int num1, int num2) {
//        if (num2 == 0) {
//            throw new ArithmeticException("Divisor cannot be zero");
//        }
        return num1 / num2;
    }
}
