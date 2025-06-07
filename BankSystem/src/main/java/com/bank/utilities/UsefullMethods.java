package com.bank.utilities;

import java.util.Scanner;

public final class UsefullMethods {

    static Scanner s = new Scanner(System.in);

    private UsefullMethods() {
    }

    public static int getValidIntInput(String prompt, int from, int to) {
        int input;
        do {
            System.out.print(prompt + " (" + from + " - " + to + "): ");
            input = s.nextInt();
            s.nextLine();
        } while (input < from || input > to);
        return input;
    }

    public static double getValidDoubleInput(String prompt, double from, double to) {
        double input;
        do {
            System.out.print(prompt + " (" + from + " - " + to + "): ");
            input = s.nextDouble();
            s.nextLine();
        } while (input < from || input > to);
        return input;
    }

    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
