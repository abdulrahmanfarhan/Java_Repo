package bmicalculator;

import java.util.Scanner;

public class BMICalculator {
    public static double metricCalc(Scanner s) {
        System.out.println("Enter height in meters");
        double h = s.nextDouble();
        System.out.println("Enter weight in kilograms");
        double w = s.nextDouble();
        return w / (h * h);
    }

    public static double imperialCalc(Scanner s) {
        System.out.println("Enter height in inches");
        double h = s.nextDouble();
        System.out.println("Enter weight in pounds");
        double w = s.nextDouble();

        return (w / (h * h)) * 703;
    }
}
