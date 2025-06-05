package com.bank.core;

import com.bank.accounts.Account;
import java.util.ArrayList;

public class Customer {

    private static int nextId = 1001;
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private ArrayList<Account> accountsList = new ArrayList<>();

    public Customer(String name) {
        this.id = nextId++;
        this.name = name;
        this.email = "";
        this.phoneNumber = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Account> getAccountsList() {
        return accountsList;
    }

    public String toString() {
        return "Customer: ID=" + id + ", Name=" + name + ", Email=" + email + ", Phone=" + phoneNumber;
    }
}
