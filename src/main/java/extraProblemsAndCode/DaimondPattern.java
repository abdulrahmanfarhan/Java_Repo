package extraProblemsAndCode;

/**
 *
 * @author Abdulrahman
 */
public class DaimondPattern {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= ((n - i)); j++) {
                System.out.print("/");
            }
            for (int K = 0; K < (i * 2) - 1; K++) {
                if (K == 0 || K == ((i * 2) - 1) - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int j = 0; j <= ((n - i)); j++) {
                System.out.print("\\");
            }
            System.out.println("");
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= ((n - i)); j++) {
                System.out.print("\\");
            }
            for (int K = 0; K < (i * 2) - 1; K++) {
                if (K == 0 || K == ((i * 2) - 1) - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for (int j = 0; j <= ((n - i)); j++) {
                System.out.print("/");
            }
            System.out.println("");
        }
    }
}
