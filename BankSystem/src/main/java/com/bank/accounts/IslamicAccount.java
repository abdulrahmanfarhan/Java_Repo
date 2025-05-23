package com.bank.accounts;

import com.bank.core.Customer;
import com.bank.utilities.InterestCalculator;

public class IslamicAccount extends Account {

    private double profitShareRate;

    public IslamicAccount(double balance, Customer owner, double profitShareRate) {
        super(balance, owner);
        this.profitShareRate = profitShareRate;
    }

    public double calculateProfit() {
        return InterestCalculator.calculate(getBalance(), profitShareRate);
    }

    public double getProfitShareRate() {
        return profitShareRate;
    }

    public void setProfitShareRate(double rate) {
        if (rate >= 0) {
            this.profitShareRate = rate;
        }
    }

    public String toString() {
        return "IslamicAccount: ID=" + getId() + ", Balance=" + getBalance() + ", ProfitShareRate=" + profitShareRate;
    }
}
