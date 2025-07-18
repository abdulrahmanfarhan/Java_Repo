package chapter12.ExceptionHandling.InputMismatchException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeIntegerAddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("enter the number one:");
                n1 = input.nextInt();
                validInput = true;
            } catch (InputMismatchException ex) {
                System.out.println("Error Input!");
            }
        }
        validInput = false;
        while (!validInput) {
            try {
                System.out.print("enter the number two:");
                n2 = input.nextInt();
                validInput = true;
            } catch (InputMismatchException ex) {
                System.out.println("Error Input!");
            }
        }

        System.out.println(n1 + n2);
    }
}
