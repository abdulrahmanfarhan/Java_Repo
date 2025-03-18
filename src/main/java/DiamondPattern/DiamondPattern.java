package DiamondPattern;

import java.util.Scanner;

/**
 * @author Abdulrahman_Farhan
 */
public class DiamondPattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of pattern1");
        int n1 = s.nextInt();
        System.out.println("enter the number of pattern2");
        int n2 = s.nextInt();
        System.out.println("enter the number of pattern3");
        int n3 = s.nextInt();
        System.out.println("Enter the size of pattern");
        int size = s.nextInt();
        printUpperHalf(n1, n2, n3, size);
        printLowerHalf(n1, n2, n3, size);
    }

    public static void printUpperHalf(int n1, int n2, int n3, int size) {
        for (int i = 1; i < size; i++) {
            printLine(size - i, i * 2 - 1, n1, '/', '\\');
            printLine(size - i, i * 2 - 1, n2, '|', '|');
            printLine(size - i, i * 2 - 1, n3, '/', '\\');
            System.out.println();
        }
    }

    public static void printLowerHalf(int n1, int n2, int n3, int size) {
        for (int i = (size - 1); i >= 1; i--) {
            printLine(size - i, i * 2 - 1, n1, '\\', '/');
            printLine(size - i, i * 2 - 1, n2, '|', '|');
            printLine(size - i, i * 2 - 1, n3, '\\', '/');
            System.out.println();
        }
    }

    public static void printLine(int spaces, int width, int pattern, char one, char two) {
        System.out.print("|");
        for (int j = 0; j <= spaces; j++) {
            System.out.print(one);
        }
        for (int k = 0; k < width; k++) {
            if (k == 0 || k == width - 1) {
                System.out.print(" ");
            } else {
                if (k % 2 != 0) {
                    System.out.print(pattern);
                } else {
                    System.out.print("|");
                }
            }
        }
        for (int j = 0; j <= spaces; j++) {
            System.out.print(two);
        }
        System.out.print("|");
    }
}
