package Extra;

import java.util.Scanner;

/**
 *
 * @author Abdulrahman
 */
public class TrianglePattern {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        String star = "";
        for (int i = 1; i <= n; i++) {
            star += "*";
            System.out.println(star);
        }
        System.out.println("-------------------");
        for (int i = n; i >= 1; i--) {
            System.out.println("*".repeat(i));
        }
    }
}
