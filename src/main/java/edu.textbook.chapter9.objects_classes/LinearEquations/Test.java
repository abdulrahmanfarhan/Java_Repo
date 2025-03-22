package LinearEquations;

import java.util.Scanner;

/**
 *
 * @author Abdulrahman
 */
public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = LinearEquations.setVar("a", s);
        double b = LinearEquations.setVar("b", s);
        double c = LinearEquations.setVar("c", s);
        double d = LinearEquations.setVar("d", s);
        double e = LinearEquations.setVar("e", s);
        double f = LinearEquations.setVar("f", s);
        LinearEquations l = new LinearEquations(a, b, c, d, e, f);
        
        l.PrintIsSolvable();
    }
}
