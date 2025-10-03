package com.bank.accounts;

import com.bank.core.Customer;
import com.bank.transactions.Transaction;
import com.bank.utilities.InterestCalculator;

public class SavingAccount extends Account {

    private double annualInterestRate;
    private double withdrawLimit;

    public SavingAccount(double balance, Customer owner, double withdrawLimit, double interestRate) {
        super(balance, owner);
        this.annualInterestRate = 0.0;
        this.withdrawLimit = withdrawLimit;
        this.annualInterestRate = interestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double calculateInterest() {
        return InterestCalculator.calculate(getBalance(), annualInterestRate);
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= withdrawLimit && balance >= amount) {
            balance -= amount; // Use balance directly
            getTransactions().add(new Transaction("WITHDRAWAL", amount));
            return true;
        }
        return false;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }
    

    public String toString() {
        return "SavingAccount: ID=" + getId() + ", Balance=" + getBalance() + ", InterestRate=" + annualInterestRate + ", WithdrawLimit=" + withdrawLimit;
    }
}
