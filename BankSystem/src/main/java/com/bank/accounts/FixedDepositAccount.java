package com.bank.accounts;

import com.bank.core.Customer;

public class FixedDepositAccount extends Account {

    private double annualInterestRate;
    private int maturityPeriod; // in months

    public FixedDepositAccount(double balance, Customer owner, int maturityPeriod) {
        super(balance, owner);
        this.annualInterestRate = 0.0;
        this.maturityPeriod = maturityPeriod;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double rate) {
        if (rate >= 0) {
            this.annualInterestRate = rate;
        }
    }

    public boolean withdraw(double amount) {
        return false; // Withdrawals not allowed until maturity
    }

    public String toString() {
        return "FixedDepositAccount: ID=" + getId() + ", Balance=" + getBalance() + ", InterestRate=" + annualInterestRate + ", MaturityPeriod=" + maturityPeriod;
    }
}
