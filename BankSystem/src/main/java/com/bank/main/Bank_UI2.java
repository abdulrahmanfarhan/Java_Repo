package com.bank.main;

import java.util.Scanner;
import com.bank.core.*;
import com.bank.accounts.*;
import com.bank.transactions.*;
import com.bank.utilities.*;
import java.util.ArrayList;

public class Bank_UI2 {

    private Bank bank;
    private static Scanner s = new Scanner(System.in);

    public Bank_UI2(String bankName) {
        this.bank = new Bank();
        this.bank.setBankName(bankName);
    }

    public void start() {
        while (true) {
            System.out.println("1. Register Customer\n2. Create Account\n3. Manage Accounts\n4. Currency Conversion\n5. Exit");

            switch (getValidIntInput("Choice: ", 1, 5)) {
                case 1:
                    registerNewCustomer();
                    break;
                case 2:
                    createNewAccount();
                    break;
                case 3:
                    manageAccounts();
                    break;
                case 4:
                    performCurrencyConversion();
                    break;
                case 5:
                    s.close();
                    return;
            }
        }
    }

    private void registerNewCustomer() {
        System.out.print("Customer name: ");
        String name = s.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }
        bank.getCustomers().add(new Customer(name));
    }

    private void createNewAccount() {
        Customer customer = selectCustomer();
        if (customer == null) {
            return;
        }

        System.out.println("1. Saving\n2. Checking\n3. Fixed Deposit\n4. Islamic\n5. Loan\n6. Back");
        int type = getValidIntInput("Choice: ", 1, 6);
        if (type == 6) {
            return;
        }

        double balance = getValidDoubleInput("Initial balance: ", 0, Double.MAX_VALUE);
        Account account = null;
        switch (type) {
            case 1:
                double withdrawLimit = getValidDoubleInput("Withdraw limit: ", 0, balance);
                account = new SavingAccount(balance, customer, withdrawLimit);
                double interestRate = getValidDoubleInput("Interest rate (e.g., 0.05): ", 0, 1);
                ((SavingAccount) account).setAnnualInterestRate(interestRate);
                break;
            case 2:
                double overDraftLimit = getValidDoubleInput("Overdraft limit: ", 0, Double.MAX_VALUE);
                account = new CheckingAccount(balance, customer, overDraftLimit);
                break;
            case 3:
                int maturityPeriod = getValidIntInput("Maturity period (months): ", 1, Integer.MAX_VALUE);
                account = new FixedDepositAccount(balance, customer, maturityPeriod);
                interestRate = getValidDoubleInput("Interest rate (e.g., 0.07): ", 0, 1);
                ((FixedDepositAccount) account).setAnnualInterestRate(interestRate);
                break;
            case 4:
                double profitShareRate = getValidDoubleInput("Profit share rate (e.g., 0.04): ", 0, 1);
                account = new IslamicAccount(balance, customer, profitShareRate);
                break;
            case 5:
                double loanInterestRate = getValidDoubleInput("Interest rate (e.g., 0.06): ", 0, 1);
                int termInMonths = getValidIntInput("Loan term (months): ", 1, Integer.MAX_VALUE);
                account = new Loan(balance, customer, loanInterestRate, termInMonths);
                break;
        }
        customer.getAccounts().add(account);
    }

    private void manageAccounts() {
        Customer customer = selectCustomer();
        if (customer == null) {
            return;
        }
        ArrayList<Account> accounts = customer.getAccounts();
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }

        while (true) {
            System.out.println("Accounts:");
            for (int i = 0; i < accounts.size(); i++) {
                System.out.println((i + 1) + ". " + accounts.get(i));
            }
            System.out.println((accounts.size() + 1) + ". Back");
            int choice = getValidIntInput("Select account: ", 1, accounts.size() + 1);
            if (choice == accounts.size() + 1) {
                break;
            }
            manageSingleAccount(accounts.get(choice - 1));
        }
    }

    private void manageSingleAccount(Account account) {
        while (true) {
            System.out.println("1. Deposit\n2. Withdraw\n3. View Transactions\n4. Calculate\n5. Back");
            int choice = getValidIntInput("Choice: ", 1, 5);
            if (choice == 5) {
                break;
            }
            switch (choice) {
                case 1:
                    double depositAmount = getValidDoubleInput("Deposit amount: ", 0, Double.MAX_VALUE);
                    if (account.deposit(depositAmount)) {
                        System.out.println("Deposited " + depositAmount + ", Balance: " + account.getBalance());
                    } else {
                        System.out.println("Invalid deposit.");
                    }
                    break;
                case 2:
                    double withdrawAmount = getValidDoubleInput("Withdraw amount: ", 0, Double.MAX_VALUE);
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Withdrew " + withdrawAmount + ", Balance: " + account.getBalance());
                    } else {
                        System.out.println("Withdrawal failed.");
                    }
                    break;
                case 3:
                    ArrayList<Transaction> transactions = account.getTransactions();
                    if (transactions.isEmpty()) {
                        System.out.println("No transactions.");
                    } else {
                        for (Transaction t : transactions) {
                            System.out.println(t);
                        }
                    }
                    break;
                case 4:
                    if (account instanceof SavingAccount) {
                        System.out.println("Interest: " + ((SavingAccount) account).calculateInterest());
                    } else if (account instanceof IslamicAccount) {
                        System.out.println("Profit: " + ((IslamicAccount) account).calculateProfit());
                    } else if (account instanceof Loan) {
                        System.out.println("Monthly Payment: " + ((Loan) account).calculateMonthlyPayment());
                    } else if (account instanceof FixedDepositAccount) {
                        double interest = InterestCalculator.calculate(account.getBalance(),
                                ((FixedDepositAccount) account).getAnnualInterestRate());
                        System.out.println("Interest: " + interest);
                    } else {
                        System.out.println("No calculation available.");
                    }
                    break;
            }
        }
    }

    private void performCurrencyConversion() {
        System.out.println("1. USD to JOD\n2. JOD to USD\n3. Back");
        int choice = getValidIntInput("Choice: ", 1, 3);
        if (choice == 3) {
            return;
        }
        double amount = getValidDoubleInput("Amount: ", 0, Double.MAX_VALUE);
        if (choice == 1) {
            System.out.println(amount + " USD = " + CurrencyConverter.convertUSDToJOD(amount) + " JOD");
        } else {
            System.out.println(amount + " JOD = " + CurrencyConverter.convertJODToUSD(amount) + " USD");
        }
    }

    private Customer selectCustomer() {
        ArrayList<Customer> customers = bank.getCustomers();
        if (customers.isEmpty()) {
            System.out.println("No customers registered.");
            return null;
        }
        System.out.println("Customers:");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println((i + 1) + ". " + customers.get(i).getName());
        }
        System.out.println((customers.size() + 1) + ". Back");
        int choice = getValidIntInput("Choice: ", 1, customers.size() + 1);
        if (choice == customers.size() + 1) {
            return null;
        }
        return customers.get(choice - 1);
    }

    private int getValidIntInput(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String inputStr = s.nextLine();
            if (inputStr.matches("-?\\d+")) {
                int input = Integer.parseInt(inputStr);
                if (input >= min && input <= max) {
                    return input;
                }
                System.out.println("Enter a number between " + min + " and " + max + ".");
            } else {
                System.out.println("Enter a valid number.");
            }
        }
    }

    private double getValidDoubleInput(String prompt, double min, double max) {
        while (true) {
            System.out.print(prompt);
            String inputStr = s.nextLine();
            if (inputStr.matches("-?\\d+(\\.\\d+)?")) {
                double input = Double.parseDouble(inputStr);
                if (input >= min && input <= max) {
                    return input;
                }
                System.out.println("Enter a number between " + min + " and " + max + ".");
            } else {
                System.out.println("Enter a valid number.");
            }
        }
    }

}
