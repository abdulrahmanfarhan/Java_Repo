package chapter9.objects_classes.QuadraticEquationEx;

import java.util.Scanner;

/**
 *
 * @author Abdulrahman
 */
public class Test {

    public static void main(String[] args) {
        System.out.print("Enter coefficient a: ");
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = s.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = s.nextDouble();
        QuadraticEquation q1 = new QuadraticEquation(a, b, c);
        double discrimant = q1.getDiscriminant();
        if (discrimant > 0) {
            System.out.println("The root-1 is: " + q1.getRoot1());
            System.out.println("The root-2 is: " + q1.getRoot2());
        } else if (discrimant == 0) {
            System.out.println("The root-1 is:" + q1.getRoot1());
        } else if (discrimant < 0) {
            System.out.println("The equation has no real roots.");
        }
    }
}
