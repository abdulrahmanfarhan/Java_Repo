package Extra;
import java.util.Scanner;
public class HexagonAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of a hexagon : ");
        double side = input.nextDouble();
        
        double area = (0.5)*(3*(Math.pow(3, 0.5)) * (Math.pow(side, 2)) );
        
        System.out.print("The area = " + area);
        
    }
}
