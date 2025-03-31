package Extra;
import java.util.Scanner;
public class InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the balance : ");
        double balance = input.nextDouble();
        System.out.print("Enter the annual Interest Rate : ");
        double annualInterestRate = input.nextDouble();
        
        double interest = balance * (annualInterestRate / 1200);
        
        System.out.print("The interest = " + interest);
    }
    
}
