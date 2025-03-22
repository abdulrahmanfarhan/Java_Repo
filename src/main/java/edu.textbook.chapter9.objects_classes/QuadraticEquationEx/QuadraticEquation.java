package QuadraticEquationEx;

/**
 *
 * @author Abdulrahman
 */
public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        }
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        }
    }
}
