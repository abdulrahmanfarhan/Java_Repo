package edu.zuj.term.extra;
import java.util.Scanner;
public class MiddlePointTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("----FOR Middle Point 1----");
        System.out.println("Enter the point one (X and Y)");
        System.out.print("X1 = ");
        double x11 = input.nextDouble();
        System.out.print("Y1 = ");
        double y11 = input.nextDouble();
        System.out.println("Enter the point Two (X and Y)");
        System.out.print("X2 = ");
        double x21 = input.nextDouble();
        System.out.print("Y2 = ");
        double y21 = input.nextDouble();
        
        double midx1 = (x11 + x21) / 2 ;
        double midy1 = (y11 + y21) / 2 ;
        
        
        System.out.println("----FOR Middle Point 2----");
        System.out.println("Enter the point one (X and Y)");
        System.out.print("X1 = ");
        double x12 = input.nextDouble();
        System.out.print("Y1 = ");
        double y12 = input.nextDouble();
        System.out.println("Enter the point Two (X and Y)");
        System.out.print("X2 = ");
        double x22 = input.nextDouble();
        System.out.print("Y2 = ");
        double y22 = input.nextDouble();
        
        double midx2 = (x12 + x22) / 2 ;
        double midy2 = (y12 + y22) / 2 ;
       

        System.out.println("----FOR Middle Point 3----");
        System.out.println("Enter the point one (X and Y)");
        System.out.print("X1 = ");
        double x13 = input.nextDouble();
        System.out.print("Y1 = ");
        double y13 = input.nextDouble();
        System.out.println("Enter the point Two (X and Y)");
        System.out.print("X2 = ");
        double x23 = input.nextDouble();
        System.out.print("Y2 = ");
        double y23 = input.nextDouble();
        
        double midx3 = (x13 + x23) / 2 ;
        double midy3 = (y13 + y23) / 2 ;
        

        System.out.println("----FOR Middle Point 4----");
        System.out.println("Enter the point one (X and Y)");
        System.out.print("X1 = ");
        double x14 = input.nextDouble();
        System.out.print("Y1 = ");
        double y14 = input.nextDouble();
        System.out.println("Enter the point Two (X and Y)");
        System.out.print("X2 = ");
        double x24 = input.nextDouble();
        System.out.print("Y2 = ");
        double y24 = input.nextDouble();
        
        double midx4 = (x14 + x24) / 2 ;
        double midy4 = (y14 + y24) / 2 ;


        System.out.println("----FOR Middle Point 5----");
        System.out.println("Enter the point one (X and Y)");
        System.out.print("X1 = ");
        double x15 = input.nextDouble();
        System.out.print("Y1 = ");
        double y15 = input.nextDouble();
        System.out.println("Enter the point Two (X and Y)");
        System.out.print("X2 = ");
        double x25 = input.nextDouble();
        System.out.print("Y2 = ");
        double y25 = input.nextDouble();
        
        double midx5 = (x15 + x25) / 2 ;
        double midy5 = (y15 + y25) / 2 ;

        
    System.out.println("_______________");
    System.out.println("This is the calculation of the midpoint between the points.");
    System.out.println("_______________");
    
    System.out.println("THE MIDDLE POINT ONE   = ( " + midx1 +" , " + midy1 +" ) " );
    System.out.println("THE MIDDLE POINT Two   = ( " + midx2 +" , " + midy2 +" ) " );
    System.out.println("THE MIDDLE POINT Three = ( " + midx3 +" , " + midy3 +" ) " );
    System.out.println("THE MIDDLE POINT Four  = ( " + midx4 +" , " + midy4 +" ) " );
    System.out.println("THE MIDDLE POINT Five  = ( " + midx5 +" , " + midy5 +" ) " );
    
    input.close();

    }
    
}
