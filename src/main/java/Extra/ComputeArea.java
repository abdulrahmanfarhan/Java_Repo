package Extra;
import java.util.Scanner;
public class ComputeArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius ( > 0 ) :");
        double radius = input.nextDouble();
        if (radius >= 0 ) {
        double area = Math.pow(radius, 2) * 3.14159 ;
        System.out.print(area);
        }
        else {
        System.out.print("Incorrect input!! ");
        }
        
    }
}
