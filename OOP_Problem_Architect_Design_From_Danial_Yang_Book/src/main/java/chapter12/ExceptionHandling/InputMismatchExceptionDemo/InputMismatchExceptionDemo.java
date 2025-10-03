package chapter12.ExceptionHandling.InputMismatchExceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter the number: ");
                int num = input.nextInt();

                System.out.println("The number was entered is " + num);
                continueInput = false;

            } catch (InputMismatchException ex) {
                System.out.println("Try again. (Incorrect input: an integer is required)");
                input.nextLine();
            }
        } while (continueInput);

        System.out.println("Bye");
    }
}
