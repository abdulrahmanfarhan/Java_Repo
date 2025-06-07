package com.bank.transactions;

import java.util.Date;

public class Transaction {

    private String type;
    private double amount;
    private Date time;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.time = new Date();
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public Date getTime() {
        return time;
    }

    @Override
    public String toString() {
        System.out.println("===================================================================");
        return "Transaction: Time= + " + time.toString() + ", Amount=" + amount + ", Type=" + type;
    }
}
