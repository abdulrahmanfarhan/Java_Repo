package chapter10.ObjectOrientedThinking.ATM;

import java.util.Date;

public class Account {

    private int id;
    private double annualInteerestRate;
    private double balance;
    private Date dateCreated = new Date();

    public Account(int id, double balance) {
        this.id = id;
        setBalance(balance);
    }

    public int getId() {
        return id;
    }

    public double getAnnualInteerestRate() {
        return annualInteerestRate;
    }

    public void setAnnualInteerestRate(double annualInteerestRate) {
        this.annualInteerestRate = annualInteerestRate;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double amount) {
        if (amount > 0) {
            this.balance = amount;
        } else {
            System.out.println("Invalid input!");
        }
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (this.annualInteerestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return this.balance * this.getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid input!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", balance=" + balance + '}';
    }


}
