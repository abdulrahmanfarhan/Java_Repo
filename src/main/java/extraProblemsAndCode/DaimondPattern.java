package extraProblemsAndCode;

import java.util.Scanner;

/**
 *
 * @author Abdulrahman
 */
public class DaimondPattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        for (int i = 1; i < n; i++) {
            //0000000000000000000000000000000000000000000(1/1)
            System.out.print("|");
            for (int j = 0; j <= ((n - i)); j++) {
                System.out.print("/");
            }
            for (int K = 0; K < (i * 2) - 1; K++) {
                if (K == 0 || K == (i * 2) - 2) {
                    //frame
                    System.out.print(" ");
                } else {
                    if (K % 2 == 0) {
                        System.out.print(".");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            for (int j = 0; j <= ((n - i)); j++) {
                System.out.print("\\");
            }
            //1111111111111111111111111111111111111111111111(1/2)
            System.out.print("|");
            for (int j = 0; j <= ((n - i)); j++) {
                System.out.print("/");
            }
            for (int K = 0; K < (i * 2) - 1; K++) {
                if (K == 0 || K == (i * 2) - 2) {
                    //frame
                    System.out.print(" ");
                } else {
                    if (K % 2 == 0) {
                        System.out.print("^");
                    } else {
                        System.out.print("o");
                    }
                }
            }
            for (int j = 0; j <= ((n - i)); j++) {
                System.out.print("\\");
            }
            //0000000000000000000000000000000000000000000(2/1)
            System.out.print("|");
            for (int j = 0; j <= ((n - i)); j++) {
                System.out.print("/");
            }
            for (int K = 0; K < (i * 2) - 1; K++) {
                if (K == 0 || K == (i * 2) - 2) {
                    //frame
                    System.out.print(" ");
                } else {
                    if (K % 2 == 0) {
                        System.out.print(".");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            for (int j = 0; j <= ((n - i)); j++) {
                System.out.print("\\");
            }
            System.out.print("|");
            System.out.println("");
        }

        for (int i = n; i >= 1; i--) {
            //0000000000000000000000000000000000000000000(2/2)
            System.out.print("|");
            for (int j = 0; j <= ((n - i)); j++) {
                System.out.print("\\");
            }
            for (int K = 0; K < (i * 2) - 1; K++) {
                if (K == 0 || K == (i * 2) - 2) {
                    //frame
                    System.out.print(" ");
                } else {
                    if (K % 2 == 0) {
                        System.out.print("v");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            for (int j = 0; j <= ((n - i)); j++) {
                System.out.print("/");
            }
            //111111111111111111111111111111111111111(3/1)
            System.out.print("|");
            for (int j = 0; j <= ((n - i)); j++) {
                System.out.print("\\");
            }
            for (int K = 0; K < (i * 2) - 1; K++) {
                if (K == 0 || K == (i * 2) - 2) {
                    //frame
                    System.out.print(" ");
                } else {
                    if (K % 2 == 0) {
                        System.out.print(".");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            for (int j = 0; j <= ((n - i)); j++) {
                System.out.print("/");
            }
            //0000000000000000000000000000000000000000000(3/2)
            System.out.print("|");
            for (int j = 0; j <= ((n - i)); j++) {
                System.out.print("\\");
            }
            for (int K = 0; K < (i * 2) - 1; K++) {
                if (K == 0 || K == (i * 2) - 2) {
                    //frame
                    System.out.print(" ");
                } else {
                    if (K % 2 == 0) {
                        System.out.print("v");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            for (int j = 0; j <= ((n - i)); j++) {
                System.out.print("/");
            }
            System.out.print("|");
            System.out.println("");
        }
    }
}
