package edu.zuj.term.extra;
import java.util.Scanner;
public class DrivingCostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the driving distance: ");
        double distance =input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double fuelEfficiency=input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double gallonPrice =input.nextDouble();
        double cost = gallonPrice * (distance/fuelEfficiency) ;
        System.out.print("The Cost Is = "+cost);
    }
    
}
