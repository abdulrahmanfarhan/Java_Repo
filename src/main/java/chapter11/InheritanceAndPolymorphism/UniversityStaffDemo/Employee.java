package chapter11.InheritanceAndPolymorphism.UniversityStaffDemo;

public class Employee extends Person {

    public Employee() {
        this("(2) Performs Employee Tasks");
        System.out.println("(3) Performs Person Tasks");
    }

    public Employee(String s) {
        //super();
        System.out.println(s);
    }
}
