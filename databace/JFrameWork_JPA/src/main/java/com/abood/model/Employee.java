package com.abood.model;

import jakarta.persistence.*;

@Entity

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    @Column(name = "phone_number")
    private String phoneNumber;
    private String email;

    public Employee() {
    }

    public Employee(String name, int age, String phoneNumber, String email) {
        this.setName(name).setAge(age).setPhoneNumber(phoneNumber).setEmail(email);
    }

    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        if (id > 0) this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        if (name != null) this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Employee setAge(int age) {
        if (age > 0) this.age = age;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Employee setPhoneNumber(String phoneNumber) {
        if (phoneNumber != null)  this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Employee setEmail(String email) {
        if (email != null)  this.email = email;
        return this;
    }
}

