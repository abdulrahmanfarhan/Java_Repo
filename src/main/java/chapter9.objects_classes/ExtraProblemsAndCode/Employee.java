package chapter9.objects_classes.ExtraProblemsAndCode;

public class Employee {

    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String name, int age) {
        this(name, age, 3000);
    }

    public Employee(int age, int salary) {
        this("Unknown", age, salary);
    }
    public void display(){
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(20, 800);
        emp1.display();
    }
}
