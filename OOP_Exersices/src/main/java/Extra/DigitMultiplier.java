package Extra;
import java.util.Scanner;
public class DigitMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number between 0 and 1000 : ");
        double num = input.nextDouble();
        int first = (int)num / 100 ;
        int third = (int)num % 10 ;
        int mid1 = (int)num / 10 ;
        int mid2 = (int)mid1 %10 ;
        int multiplication = (int) first * mid2 * third ;
        System.out.println("The first digit = " + first);
        System.out.println("Thhe Second digit = " + mid2);
        System.out.println("The third digit = " + third);
        System.out.println("The multiplication of all its digits = " + multiplication );
        
        
    }
}
