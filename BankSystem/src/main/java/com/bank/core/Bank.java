package com.bank.core;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Customer> customers;

    public Bank() {
        this.bankName = "";
        this.customers = new ArrayList<>();
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String toString() {
        return "Bank: " + bankName + ", Customers: " + customers.size();
    }
}
