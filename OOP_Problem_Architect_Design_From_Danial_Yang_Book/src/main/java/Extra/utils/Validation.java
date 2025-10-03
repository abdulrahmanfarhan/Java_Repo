package Extra.utils;

import java.util.Scanner;

public class Validation {

    private static final Scanner scanner = new Scanner(System.in);

    public static int getIntInRange(int from, int to) {
        int input;
        do {
            System.out.print("Enter the number between(" + from + ") and (" + to + "):");
            input = scanner.nextInt();
        } while (input < from || input > to);
        return input;
    }

    public static double getDoubleInRange(double from, double to) {
        double input;
        do {
            System.out.print("Enter the number between(" + from + ") and (" + to + "):");
            input = scanner.nextDouble();
        } while (input < from || input > to);
        return input;
    }

    public static int getIntFrom(int min) {
        int input;
        do {
            System.out.print("Enter a number greater than(" + min + ") :");
            input = scanner.nextInt();
        } while (input < min);
        return input;
    }

    public static double getDoubleFrom(double min) {
        double input;
        do {
            System.out.print("Enter a number greater than(" + min + ") :");
            input = scanner.nextDouble();
        } while (input < min);
        return input;
    }

    public static int getIntTo(int max) {
        int input;
        do {
            System.out.print("Enter the number smaller than (" + max + ") :");
            input = scanner.nextInt();
        } while (input > max);
        return input;
    }

    public static double getDoubleTo(double max) {
        double input;
        do {
            System.out.print("Enter the number smaller than (" + max + ") :");
            input = scanner.nextDouble();
        } while (input > max);
        return input;
    }
}
