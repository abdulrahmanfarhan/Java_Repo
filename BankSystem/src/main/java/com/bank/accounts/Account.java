package com.bank.accounts;

import com.bank.core.Customer;
import com.bank.transactions.Transaction;
import java.util.ArrayList;
import java.time.LocalDate;

public class Account {

    private int id;
    private static int nextId = 1;
    protected double balance;
    private Customer owner;
    private String creationDate;
    private ArrayList<Transaction> transactions;

    public Account(double balance, Customer owner) {
        this.id = nextId++;
        this.balance = balance;
        this.owner = owner;
        this.creationDate = LocalDate.now().toString();
        this.transactions = new ArrayList<>();
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add(new Transaction("DEPOSIT", amount));
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("WITHDRAWAL", amount));
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public Customer getOwner() {
        return owner;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String toString() {
        return "Account: ID=" + id + ", Balance=" + balance + ", Owner=" + owner.getName();
    }
}
