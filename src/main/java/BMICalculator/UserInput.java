package bmicalculator;

import java.util.Scanner;

public class UserInput {

    public static String selectSystem() {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcom to BMI Calculate app");
        System.out.println("Enter the system (Imperial/Metric):");
        String sstm = s.nextLine();
        return sstm.equalsIgnoreCase("Imperial")||sstm.equalsIgnoreCase("Metric") ? sstm : "";
    }
}
