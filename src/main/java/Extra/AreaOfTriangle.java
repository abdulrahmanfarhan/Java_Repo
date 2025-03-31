package Extra;
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the position of three point : ");
        System.out.print("X1 : ");
        double x1 = input.nextDouble();
        System.out.print("Y1 : ");
        double y1 = input.nextDouble();
        System.out.print("X2 : ");
        double x2 = input.nextDouble();
        System.out.print("Y2 : ");
        double y2 = input.nextDouble();
        System.out.print("X3 : ");
        double x3 = input.nextDouble();
        System.out.print("Y3 : ");
        double y3 = input.nextDouble();
        
        double side1 = Math.pow((Math.pow((y2 - y1), 2) + Math.pow(x2 - x1, 2)), 0.5) ;
        double side2 = Math.pow((Math.pow((y3 - y2), 2) + Math.pow(x3 - x2, 2)), 0.5) ;
        double side3 = Math.pow((Math.pow((y3 - y1), 2) + Math.pow(x3 - x1, 2)), 0.5) ;
        
        double s = (side1 + side2 + side3) / 2 ;
        double area = Math.pow((s*(s-side1)*(s-side2)*(s-side3)), 0.5);
        
        System.out.print("The Area = " + area );
        
        
        
    }
    
}
