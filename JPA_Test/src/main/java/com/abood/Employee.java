package com.abood;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private long salary;

    public Employee() {}
    public Employee(int id) { this.id = id; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id;}
    public String getName() { return name; }
    public Employee setName(String name) { this.name = name; return this; }
    public long getSalary() { return salary;}
    public Employee setSalary(long salary) { this.salary = salary;  return this; }
}
