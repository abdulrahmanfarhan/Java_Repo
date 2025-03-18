package extraProblemsAndCode;

import java.util.Scanner;

/**
 * @author Abdulrahman
 */
public class DiamondPattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int n = s.nextInt();
        printUpperHalf(n);
        printLowerHalf(n);
    }

    public static void printUpperHalf(int n) {
        for (int i = 1; i < 10; i++) {
            printLine(10 - i, i * 2 - 1, '1', '/', '\\', ' ');
            printLine(10 - i, i * 2 - 1, '|', '|', '|', '-');
            printLine(10 - i, i * 2 - 1, '1', '/', '\\', ' ');
            System.out.println();
        }
    }

    public static void printLowerHalf(int n) {
        for (int i = 10; i >= 1; i--) {
            printLine(10 - i, i * 2 - 1, 'o', '\\', '/', '^');
            printLine(10 - i, i * 2 - 1, '|', '|', '|', '-');
            printLine(10 - i, i * 2 - 1, 'o', '\\', '/', '^');
            System.out.println();
        }
    }

    public static void printLine(int spaces, int width, char pattern1, char one, char two, char full) {
        System.out.print("|");
        for (int j = 0; j <= spaces; j++) {
            System.out.print(one);
        }
        for (int k = 0; k < width; k++) {
            if (k == 0 || k == width - 1) {
                System.out.print(" ");
            } else {
                System.out.print(k % 2 == 0 ? pattern1 : full);
            }
        }
        for (int j = 0; j <= spaces; j++) {
            System.out.print(two);
        }
        System.out.print("|");
    }
}
