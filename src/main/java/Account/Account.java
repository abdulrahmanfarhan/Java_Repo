package Account;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Abdulrahman
 */
public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    //no argument constructor
    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    //a constractor whith specefid id and balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    public double getMonthlyInterest() {
        return getMonthlyInterestRate() * balance;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful! Amount withdrawn: $" + amount);
            System.out.println("Remaining balance: $" + this.balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! Amount deposited: $" + amount);
            System.out.println("New balance: $" + this.balance);
        } else {
        }
    }
}
