package com.bank.main;

import com.bank.core.Bank;
import com.bank.core.Customer;
import com.bank.accounts.SavingAccount;
import com.bank.accounts.CheckingAccount;
import com.bank.accounts.FixedDepositAccount;
import com.bank.accounts.IslamicAccount;
import com.bank.accounts.Loan;
import com.bank.utilities.CurrencyConverter;
import com.bank.utilities.InterestCalculator;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // إنشاء بنك
        System.out.print("Enter the name of Bank:");
        String BankName = s.nextLine();
        Bank bank = new Bank();
        bank.setBankName(s.nextLine());

        //customer1
        System.out.print("enter the name of customer 1:");
        Customer customer1 = new Customer(s.nextLine());
        System.out.print("Enter the email:");
        customer1.setEmail(s.nextLine());
        System.out.println("Enter the phone number:");
        customer1.setPhoneNumber(s.nextLine());
        bank.getCustomers().add(customer1);

        System.out.println("--Saving account--");
        System.out.println("Enter the balance:");
        double Saving_Balance = s.nextDouble();
        System.out.println("Enter the withdraw limit:");
        double withdrawLimit = s.nextDouble();
        System.out.println("Enter the Annual Interest Rate:");
        double AnnualInterestRate = s.nextDouble();
        SavingAccount savingAccount = new SavingAccount(Saving_Balance, customer1, withdrawLimit);
        savingAccount.setAnnualInterestRate(AnnualInterestRate);
        customer1.getAccounts().add(savingAccount);

        System.out.println("--Cheking Account--");
        System.out.println("Enter the balance:");
        double Cheking_Balance = s.nextDouble();
        System.out.println("Enter the over draft limit:");
        double overDraft = s.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount(Cheking_Balance, customer1, overDraft);
        customer1.getAccounts().add(checkingAccount);

        System.out.println("--Loan account--");
        System.out.println("Enter the loan ammount:");
        double loanAmmount = s.nextDouble();
        System.out.println("Enter the interest rate:");
        double interestRate = s.nextDouble();
        System.out.println("Enter the term in month:");
        int term = s.nextInt();
        Loan loan = new Loan(loanAmmount, customer1, interestRate, term);
        customer1.getAccounts().add(loan);

        //customer2
        System.out.print("enter the name of customer 2:");
        Customer customer2 = new Customer(s.nextLine());
        System.out.print("Enter the email:");
        customer2.setEmail(s.nextLine());
        System.out.println("Enter the phone number:");
        customer2.setPhoneNumber(s.nextLine());
        bank.getCustomers().add(customer2);

        System.out.println("-- Fixed Deposit Account--");
        System.out.println("Enter the balance:");
        double Fixed_Balance = s.nextDouble();
        System.out.println("Enter the maturity period:");
        int maturityPeriod = s.nextInt();
        FixedDepositAccount fixedAccount = new FixedDepositAccount(Fixed_Balance, customer2, maturityPeriod);
        System.out.println("Enter the annual Interest Rate: ");
        double annualInterestRate = s.nextDouble();
        fixedAccount.setAnnualInterestRate(annualInterestRate);
        customer2.getAccounts().add(fixedAccount);

        System.out.println("-- islamic Account--");
        System.out.println("enter the balance:");
        double Islamic_balance = s.nextDouble();
        System.out.println("Enter the profit share rate:");
        double profitShareRate = s.nextDouble();
        IslamicAccount islamicAccount = new IslamicAccount(Islamic_balance, customer2, profitShareRate);
        customer2.getAccounts().add(islamicAccount);

        //-----------------------------
        savingAccount.deposit(500.0);
        System.out.println("SavingAccount Balance after deposit: " + savingAccount.getBalance());
        boolean withdrawSuccess = savingAccount.withdraw(200.0);
        System.out.println("Withdraw 200 from SavingAccount: " + (withdrawSuccess ? "Success" : "Failed") + ", Balance: " + savingAccount.getBalance());

        checkingAccount.withdraw(2500.0);
        System.out.println("CheckingAccount Balance after withdraw: " + checkingAccount.getBalance());

        boolean fixedWithdraw = fixedAccount.withdraw(1000.0);
        if (fixedWithdraw) {
            System.out.println("Withdraw 1000 from FixedDepositAccount Success");
        } else {
            System.out.println("Withdraw 1000 from FixedDepositAccount Failed");
        }

        double profit = islamicAccount.calculateProfit();
        System.out.println("IslamicAccount Profit: " + profit);

        double monthlyPayment = loan.calculateMonthlyPayment();
        System.out.println("Loan Monthly Payment: " + monthlyPayment);

        System.out.println(1000.0 + " USD = " + CurrencyConverter.convertUSDToJOD(1000.0) + " JOD");

        double interest = InterestCalculator.calculate(savingAccount.getBalance(), 0.05);
        System.out.println("SavingAccount Interest: " + interest);

        //------------------
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("Bank Info: " + bank);
        System.out.println("Customer 1: " + customer1);
        System.out.println("Customer 2: " + customer2);
        System.out.println("SavingAccount: " + savingAccount);
        System.out.println("CheckingAccount: " + checkingAccount);
        System.out.println("FixedDepositAccount: " + fixedAccount);
        System.out.println("IslamicAccount: " + islamicAccount);
        System.out.println("Loan: " + loan);
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");
    }
}
