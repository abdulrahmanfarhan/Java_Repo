package Extra;
import java.util.Scanner;
public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the (X1,Y1) and (X2,Y2) ");
        System.out.print("X1 : ");
        double x1 =input.nextDouble();
        System.out.print("Y1 : ");
        double y1 = input.nextDouble();
        System.out.print("X2 : ");
        double x2 = input.nextDouble();
        System.out.print("Y2 : ");
        double y2 = input.nextDouble();
        double distance = Math.pow((Math.pow((x2 - x1), 2)+(Math.pow((y2 - y1), 2))), 0.5);
        System.out.println("The distance = " + distance);
    }
}
