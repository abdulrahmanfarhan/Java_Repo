
package edu.zuj.term.extra;
import java.util.Scanner;
public class RunwayLengthCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the (a) then (v)");
        double a =input.nextDouble();
        double v = input.nextDouble();
        double length = ((v * v)/(2 * a));
        
        System.out.println("length = " + length);
        
    }
}
