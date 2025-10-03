package com.bank.accounts;

import com.bank.core.Customer;

public class Loan extends Account {

    private double interestRate;
    private int termInMonths;

    public Loan(double balance, Customer owner, double interestRate, int termInMonths) {
        super(balance, owner);
        this.interestRate = interestRate;
        this.termInMonths = termInMonths;
    }

    public double calculateMonthlyPayment() {
        return (getBalance() * interestRate) / termInMonths; // Simple calculation
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double rate) {
        if (rate >= 0) {
            this.interestRate = rate;
        }
    }

    public int getTermInMonths() {
        return termInMonths;
    }

    public void setTermInMonths(int term) {
        if (term > 0) {
            this.termInMonths = term;
        }
    }

    public String toString() {
        return "Loan: ID=" + getId() + ", Balance=" + getBalance() + ", InterestRate=" + interestRate + ", TermInMonths=" + termInMonths;
    }
}
