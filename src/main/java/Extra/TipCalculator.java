package Extra;
import java.util.Scanner;
public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sub total : ");
        double subtotal = input.nextDouble();
        System.out.print("Enter the gratuity rate in % (e.g: 2 ): ");
        double tipRate = input.nextDouble();
        
        double gratuity = ( subtotal * tipRate ) / 100 ;
        
        double endtotal = gratuity + subtotal ; 
        System.out.println("---------------------");
        System.out.println("The tip = " + gratuity);
        System.out.println("---------------------");
        System.out.println("The total amount = " + endtotal);
    }
    
}
