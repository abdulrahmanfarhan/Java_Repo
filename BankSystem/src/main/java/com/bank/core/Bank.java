package com.bank.core;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.bankName = name;
        this.customers = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public ArrayList<Customer> getCustomersList() {
        return customers;
    }

    public String toString() {
        return "Bank: " + bankName + ", Customers: " + customers.size();
    }
}
