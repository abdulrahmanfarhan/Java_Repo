package Extra;
import java.util.Scanner;
public class SquareMeterToPingConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number in square meter : ");
        double square = input.nextDouble();
        double ping = square * 0.3025 ;
        
        System.out.println(ping);
    }
}
