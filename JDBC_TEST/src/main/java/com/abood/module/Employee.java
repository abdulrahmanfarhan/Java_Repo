package com.abood.module;

import java.sql.Date;

public class Employee {
    private int id;
    private String name;
    private Gender gender;
    private double salary;
    private java.sql.Date BirthDate;

    public Employee(int id, String name, Gender gender, java.util.Date birthDate,double salary ) {
        setId(id);
        setName(name);
        setGender(gender);
        setSalary(salary);
        setBirthDate(birthDate);
    }


    public void setId(int id) {
        if (id >= 0) this.id = id;
    }

    public void setName(String name) {
        if (name != null) this.name = name;
    }

    public void setGender(Gender gender) {
        if (gender.equals(Gender.MALE) || gender.equals(Gender.FEMALE)) this.gender = gender;
    }

    public void setSalary(double salary) {
        if (salary >= 0) this.salary = salary;
    }

    public void setBirthDate(java.util.Date birthDate) {
        if (birthDate != null) {
            this.BirthDate = new java.sql.Date(birthDate.getTime());
        } else {
            this.BirthDate = null;
        }
    }


    @Override
    public String toString() {
        return "----------------\n" + "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", BirthDate=" + BirthDate +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

}
