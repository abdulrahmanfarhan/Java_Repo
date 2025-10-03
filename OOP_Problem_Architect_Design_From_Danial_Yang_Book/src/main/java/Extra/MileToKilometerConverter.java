package Extra;
import java.util.Scanner;
public class MileToKilometerConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter The number of miles : - ");
        double mile = input.nextDouble();
        
        double kilo = mile * 1.6 ;
        
        System.out.println(kilo + " kilo");
    }
}
