package chapter9.objectsClasses.LinearEquations;

import java.util.Scanner;

/**
 *
 * @author Abdulrahman
 */
public class LinearEquations {

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquations(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() { return this.a; }
    public double getB() { return this.b; }
    public double getC() { return this.c; }
    public double getD() { return this.d; }
    public double getE() { return this.e; }
    public double getF() { return this.f; }

    public boolean isSolvable() {
        return (a * d - b * c != 0);
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }

    public static double setVar(String symboll, Scanner s) {
        System.out.println("Enter the number of " + symboll);
        return s.nextDouble();
    }

    public void PrintIsSolvable() {
        if (this.isSolvable()) {
            System.out.println("---------------");
            System.out.println("x = "+this.getX());
            System.out.println("y = "+this.getY());
        } else {
            System.out.println("The equation has no solution");
        }
    }
}
