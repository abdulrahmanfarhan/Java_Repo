package com.bank.main;

import java.util.Scanner;
import com.bank.transactions.*;
import com.bank.utilities.*;
import com.bank.core.*;
import com.bank.accounts.*;
import java.util.ArrayList;

public class Bank_UI {

    private Bank bank;
    static Scanner s = new Scanner(System.in);

    public Bank_UI(String BankName) {
        this.bank = new Bank();
        this.bank.setBankName(BankName);
    }

    public void start() {
        clearScreen();
        displayWelcomeMessage();
        boolean running = true;
        while (running) {
            clearScreen();
            displayMainMenu();
            int choice = getValidIntInput("Enter your choice: ", 1, 7);

            switch (choice) {
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
                    displayBankInfo();
                    break;
                case 6:
                    clearScreen();
                    displayAbout();
                    System.out.print("Press Enter to return to Main Menu...");
                    s.nextLine();
                    break;
                case 7:
                    clearScreen();
                    System.out.println("\n===== Thank you for using " + this.bank.getBankName() + "! =====\n\n\n");
                    running = false;
                    break;
            }
        }
        s.close();
    }

    private void clearScreen() {
        for (int i = 0; i < 30; i++) {
            System.out.println();
        }
    }

    private void displayWelcomeMessage() {
        System.out.println("===================================================");
        System.out.println("             Welcome to " + this.bank.getBankName());
        System.out.println("===================================================");
        System.out.println("A user-friendly banking system for all your needs!");
        System.out.println("===================================================");
        System.out.println("             BY: Abdulrahman Farhan                ");
        System.out.println("===================================================\n");
    }

    private void displayMainMenu() {
        System.out.println("===== Main Menu =====");
        System.out.println("1. Register New Customer");
        System.out.println("2. Create New Account");
        System.out.println("3. Manage Accounts");
        System.out.println("4. Currency Conversion");
        System.out.println("5. Display Bank Info");
        System.out.println("6. About");
        System.out.println("7. Back (Exit)");
        System.out.println("=====================");
    }

    private void registerNewCustomer() {
        clearScreen();
        System.out.println("===== Register New Customer =====");
        System.out.print("Enter customer name: ");
        String name = s.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Error: Name cannot be empty!");
            System.out.print("Press Enter to return...");
            s.nextLine();
            return;
        }

        Customer customer = new Customer(name);
        System.out.print("Enter email (optional, press Enter to skip): ");
        String email = s.nextLine().trim();
        if (!email.isEmpty()) {
            customer.setEmail(email);
        }

        System.out.print("Enter phone number (optional, press Enter to skip): ");
        String phone = s.nextLine().trim();
        if (!phone.isEmpty()) {
            customer.setPhoneNumber(phone);
        }

        bank.getCustomers().add(customer);
        System.out.println("Success: Customer " + name + " registered with ID " + customer.getId());
        System.out.print("Press Enter to return...");
        s.nextLine();
    }

    private void createNewAccount() {
        clearScreen();
        System.out.println("===== Create New Account =====");
        Customer customer = selectCustomer();
        if (customer == null) {
            System.out.print("Press Enter to return...");
            s.nextLine();
            return;
        }

        System.out.println("Select account type:");
        System.out.println("1. Saving Account");
        System.out.println("2. Checking Account");
        System.out.println("3. Fixed Deposit Account");
        System.out.println("4. Islamic Account");
        System.out.println("5. Loan");
        System.out.println("6. Back");
        int type = getValidIntInput("Enter your choice: ", 1, 6);
        if (type == 6) {
            return;
        }

        double balance = getValidDoubleInput("Enter initial balance: ", 0, Double.MAX_VALUE);
        Account account = null;

        switch (type) {
            case 1:
                double withdrawLimit = getValidDoubleInput("Enter withdraw limit: ", 0, balance);
                account = new SavingAccount(balance, customer, withdrawLimit);
                double interestRate = getValidDoubleInput("Enter annual interest rate (e.g., 0.05 for 5%): ", 0, 1);
                ((SavingAccount) account).setAnnualInterestRate(interestRate);
                break;
            case 2:
                double overDraftLimit = getValidDoubleInput("Enter overdraft limit: ", 0, Double.MAX_VALUE);
                account = new CheckingAccount(balance, customer, overDraftLimit);
                break;
            case 3:
                int maturityPeriod = getValidIntInput("Enter maturity period (months): ", 1, Integer.MAX_VALUE);
                account = new FixedDepositAccount(balance, customer, maturityPeriod);
                interestRate = getValidDoubleInput("Enter annual interest rate (e.g., 0.07 for 7%): ", 0, 1);
                ((FixedDepositAccount) account).setAnnualInterestRate(interestRate);
                break;
            case 4:
                double profitShareRate = getValidDoubleInput("Enter profit share rate (e.g., 0.04 for 4%): ", 0, 1);
                account = new IslamicAccount(balance, customer, profitShareRate);
                break;
            case 5:
                double loanInterestRate = getValidDoubleInput("Enter interest rate (e.g., 0.06 for 6%): ", 0, 1);
                int termInMonths = getValidIntInput("Enter loan term (months): ", 1, Integer.MAX_VALUE);
                account = new Loan(balance, customer, loanInterestRate, termInMonths);
                break;
        }

        customer.getAccounts().add(account);
        System.out.println("Success: Account created with ID " + account.getId());
        System.out.print("Press Enter to return...");
        s.nextLine();
    }

    private void manageAccounts() {
        clearScreen();
        System.out.println("===== Manage Accounts =====");
        Customer customer = selectCustomer();
        if (customer == null) {
            System.out.print("Press Enter to return...");
            s.nextLine();
            return;
        }

        ArrayList<Account> accounts = customer.getAccounts();
        if (accounts.isEmpty()) {
            System.out.println("No accounts found for " + customer.getName());
            System.out.print("Press Enter to return...");
            s.nextLine();
            return;
        }

        while (true) {
            clearScreen();
            System.out.println("Accounts for " + customer.getName() + ":");
            for (int i = 0; i < accounts.size(); i++) {
                System.out.println((i + 1) + ". " + accounts.get(i));
            }
            System.out.println((accounts.size() + 1) + ". Back");

            int choice = getValidIntInput("Select an account: ", 1, accounts.size() + 1);
            if (choice == accounts.size() + 1) {
                break;
            }

            Account account = accounts.get(choice - 1);
            manageSingleAccount(account);
        }
    }

    private void manageSingleAccount(Account account) {
        while (true) {
            clearScreen();
            System.out.println("===== Manage Account: " + account + " =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Transactions");
            System.out.println("4. Calculate Interest/Profit/Payment");
            System.out.println("5. Back");
            int choice = getValidIntInput("Enter your choice: ", 1, 5);
            if (choice == 5) {
                break;
            }

            switch (choice) {
                case 1:
                    clearScreen();
                    System.out.println("===== Deposit =====");
                    double depositAmount = getValidDoubleInput("Enter amount to deposit: ", 0, Double.MAX_VALUE);
                    if (account.deposit(depositAmount)) {
                        System.out.println("Success: Deposited " + depositAmount + ", New Balance: " + account.getBalance());
                    } else {
                        System.out.println("Error: Invalid deposit amount!");
                    }
                    System.out.print("Press Enter to continue...");
                    s.nextLine();
                    break;
                case 2:
                    clearScreen();
                    System.out.println("===== Withdraw =====");
                    double withdrawAmount = getValidDoubleInput("Enter amount to withdraw: ", 0, Double.MAX_VALUE);
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Success: Withdrew " + withdrawAmount + ", New Balance: " + account.getBalance());
                    } else {
                        System.out.println("Error: Withdrawal failed (insufficient funds or restricted account)!");
                    }
                    System.out.print("Press Enter to continue...");
                    s.nextLine();
                    break;
                case 3:
                    clearScreen();
                    System.out.println("===== Transactions for Account ID " + account.getId() + " =====");
                    ArrayList<Transaction> transactions = account.getTransactions();
                    if (transactions.isEmpty()) {
                        System.out.println("No transactions found.");
                    } else {
                        for (Transaction t : transactions) {
                            System.out.println(t);
                        }
                    }
                    System.out.print("Press Enter to continue...");
                    s.nextLine();
                    break;
                case 4:
                    clearScreen();
                    System.out.println("===== Calculate Interest/Profit/Payment =====");
                    if (account instanceof SavingAccount) {
                        double interest = ((SavingAccount) account).calculateInterest();
                        System.out.println("Interest: " + interest);
                    } else if (account instanceof IslamicAccount) {
                        double profit = ((IslamicAccount) account).calculateProfit();
                        System.out.println("Profit: " + profit);
                    } else if (account instanceof Loan) {
                        double payment = ((Loan) account).calculateMonthlyPayment();
                        System.out.println("Monthly Payment: " + payment);
                    } else if (account instanceof FixedDepositAccount) {
                        double interest = InterestCalculator.calculate(account.getBalance(),
                                ((FixedDepositAccount) account).getAnnualInterestRate());
                        System.out.println("Interest: " + interest);
                    } else {
                        System.out.println("No interest/profit calculation available for this account.");
                    }
                    System.out.print("Press Enter to continue...");
                    s.nextLine();
                    break;
            }
        }
    }

    private void performCurrencyConversion() {
        clearScreen();
        System.out.println("===== Currency Conversion =====");
        System.out.println("1. USD to JOD");
        System.out.println("2. JOD to USD");
        System.out.println("3. Back");
        int choice = getValidIntInput("Enter your choice: ", 1, 3);
        if (choice == 3) {
            return;
        }

        System.out.println("Enter amount: ");
        double amount = getValidDoubleInput("Enter amount: ", 0, Double.MAX_VALUE);
        if (choice == 1) {
            double jod = CurrencyConverter.convertUSDToJOD(amount);
            System.out.println(amount + " USD = " + jod + " JOD");
        } else {
            double usd = CurrencyConverter.convertJODToUSD(amount);
            System.out.println(amount + " JOD = " + usd + " USD");
        }
        System.out.print("Press Enter to return...");
        s.nextLine();
    }

    private void displayBankInfo() {
        clearScreen();
        System.out.println("===== Bank Information =====");
        System.out.println(bank);
        ArrayList<Customer> customers = bank.getCustomers();
        if (customers.isEmpty()) {
            System.out.println("No customers registered.");
        } else {
            System.out.println("Customers:");
            for (Customer c : customers) {
                System.out.println("----");
                System.out.println(c);
                System.out.println("----");
                ArrayList<Account> accounts = c.getAccounts();
                if (!accounts.isEmpty()) {
                    System.out.println("  Accounts:");
                    for (Account a : accounts) {
                        System.out.println("-----");
                        System.out.println("    " + a);
                        System.out.println("-----");
                    }
                }
            }
        }
        System.out.print("Press Enter to return...");
        s.nextLine();
    }

    private void displayAbout() {
        System.out.println("=====================================================");
        System.out.println("                  About " + "( " + bank.getBankName() + " )");
        System.out.println("=====================================================");
        System.out.println("    Developed by: Abdulrahman Farhan            ");
        System.out.println("    Supervisor: Dr. Jalal Kiswani               ");
        System.out.println("    Al-Zaytoonah University of Jordan           ");
        System.out.println("    Description: A simple banking system        ");
        System.out.println("    built with Java for educational purposes.   ");
        System.out.println("=====================================================\n");
        System.out.println("== © 2025 Abdulrahman Farhan. All rights reserved. ==\n");//
        System.out.println("=====================================================\n");
    }

    private Customer selectCustomer() {
        ArrayList<Customer> customers = bank.getCustomers();
        if (customers.isEmpty()) {
            System.out.println("Error: No customers registered. Please register a customer first.");
            return null;
        }

        System.out.println("\nSelect a customer:");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println((i + 1) + ". " + customers.get(i).getName() + " (ID: " + customers.get(i).getId() + ")");
        }
        System.out.println((customers.size() + 1) + ". Back");
        int choice = getValidIntInput("Enter your choice: ", 1, customers.size() + 1);
        if (choice == customers.size() + 1) {
            return null;//back
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
