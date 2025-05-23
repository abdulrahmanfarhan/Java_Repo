package com.bank.transactions;

import java.time.LocalDate;

public class Transaction {

    private String type;
    private double amount;
    private String time;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.time = LocalDate.now().toString();
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getTime() {
        return time;
    }

    public String toString() {
        return "Transaction: Type=" + type + ", Amount=" + amount + ", Time=" + time;
    }
}
