package com.bank.accounts;

import com.bank.core.Customer;
import com.bank.transactions.Transaction;

public class CheckingAccount extends Account {
    private double overDraftLimit;

    public CheckingAccount(double balance, Customer owner, double overDraftLimit) {
        super(balance, owner);
        this.overDraftLimit = overDraftLimit;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance + overDraftLimit >= amount) {
            balance -= amount; // Use balance directly
            getTransactions().add(new Transaction("WITHDRAWAL", amount));
            return true;
        }
        return false;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double limit) {
        if (limit >= 0) {
            this.overDraftLimit = limit;
        }
    }

    public String toString() {
        return "CheckingAccount: ID=" + getId() + ", Balance=" + getBalance() + ", OverDraftLimit=" + overDraftLimit;
    }
}