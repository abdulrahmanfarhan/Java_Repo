package chapter11.InheritanceAndPolymorphism.people;

import java.util.Date;

public class Employee extends Person {

    private String office;
    private double salary;
    private Date dateHired;

    public Employee() {
        dateHired = new Date();
    }

    @Override
    public String toString() {
        return super.toString() + "- Employee{" + "office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + '}';
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired() {
        this.dateHired = new Date();
    }

}
