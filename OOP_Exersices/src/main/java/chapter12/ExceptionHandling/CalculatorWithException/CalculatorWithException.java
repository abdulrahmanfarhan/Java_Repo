package chapter12.ExceptionHandling.CalculatorWithException;

import java.util.Scanner;

public class CalculatorWithException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String num1 = s.next();

        System.out.print("Enter second number: ");
        String num2 = s.next();

        try {
            System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
        } catch (NumberFormatException n){
            System.out.println("Wrong input: One of the operands is not a valid number.");
        }
    }
}
