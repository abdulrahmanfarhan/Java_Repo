package chapter10.ObjectOrientedThinking.Loan;

import java.util.Scanner;

/**
 *
 * @author Abdulrahman
 */
public class TestLoanClass {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter annual interest rate");
        double annualInterestRate = s.nextDouble();

        System.out.println("Enter number of years as an integer:");
        int numberOfYears = s.nextInt();

        System.out.println("Enter loan amount of loan:");
        double loanAmount = s.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("The loan was created on %s\n" + 
                "The monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                loan.getTotalPayment());
        
    }
}
