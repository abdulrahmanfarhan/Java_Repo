package bmicalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sstm = UserInput.selectSystem();
        while (sstm.equalsIgnoreCase("")) {
            System.out.println("Invalid choice. Please enter 'Imperial' or 'Metric'.");
            sstm = UserInput.selectSystem();
        }
        System.out.println("You selected the " + sstm + " system for BMI calculation.");
        double result = sstm.equalsIgnoreCase("Imperial")
                ? BMICalculator.imperialCalc(s)
                : BMICalculator.metricCalc(s);

        System.out.println("Your BMI is: " + result);
        if (result < 18.5) {
            System.out.println("Underweight");
        } else if (result >= 18.5 && result < 25) {
            System.out.println("Normal weight");
        } else if (result >= 25 && result < 30) {
            System.out.println("Overweight");
        } else if (result >= 30) {
            System.out.println("Obese");
        }
    }
}
