
package Extra;
import java.util.Scanner;
public class MeterToFeetConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number in meter : ");
        double meter = input.nextDouble();
        double feet = 3.2786 * meter;
        
        System.out.print(meter + " meter = " + feet + " feet");
    }
    
}
