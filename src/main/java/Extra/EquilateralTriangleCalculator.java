package edu.zuj.term.extra;
import java.util.Scanner;
public class EquilateralTriangleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter length of the sides and height of the Equilateral triangle:");
        double length = input.nextDouble();
        
        double area = (length)*(length)*(1.0/4.0)* Math.pow(3,(1.0/2.0));
        
        double volume = area * length ;
        
        System.out.println("The area = " + area);
        System.out.println("The volume = " + volume);
        
        
    }
    
}
