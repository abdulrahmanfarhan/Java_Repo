package com.bank.utilities;

import java.util.Scanner;

public final class UsefullMethods {

    static Scanner s = new Scanner(System.in);

    private UsefullMethods() {
    }

    public static int getValidIntInput(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String inputStr = s.nextLine();
            if (inputStr.matches("-?\\d+")) {
                int input = Integer.parseInt(inputStr);
                if (input >= min && input <= max) {
                    return input;
                }
                System.out.println("Enter a number between " + min + " and " + max + ".");
            } else {
                System.out.println("Enter a valid number.");
            }
        }
    }

    public static double getValidDoubleInput(String prompt, double min, double max) {
        while (true) {
            System.out.print(prompt);
            String inputStr = s.nextLine();
            if (inputStr.matches("-?\\d+(\\.\\d+)?")) {
                double input = Double.parseDouble(inputStr);
                if (input >= min && input <= max) {
                    return input;
                }
                System.out.println("Enter a number between " + min + " and " + max + ".");
            } else {
                System.out.println("Enter a valid number.");
            }
        }
    }

    public static void clearScreen() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
}
