package edu.zuj.term.extra;
import java.util.Scanner;
public class AverageAccelerationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //مسألة فيزيائية
        System.out.println("Enter the V0 / V1 / t : - ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        
        double a = ( v1 - v0 )/ t ;
        System.out.print("a = " + a);
        
    }
    
}
