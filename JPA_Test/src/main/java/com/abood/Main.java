package com.abood;

import jakarta.persistence.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();

        EmployeeService employeeService = new EmployeeService(em);

        // create and persist an employee
        em.getTransaction().begin();
        Employee emp = employeeService.creatEmployee(123, "John", 2000);
        em.getTransaction().commit();

        System.out.println("Persisted :"+emp);

        // find a specific employee
        emp = employeeService.findEmployee(123);
        System.out.println("Found :"+emp);

        // find all employees
        List<Employee> emps = employeeService.findAllEmployees();
        for (Employee e : emps){
            System.out.println(e);
        }




        // update Employee
        em.getTransaction().begin();
        emp = employeeService.raiseEmployeeSalary(123, 1000);
        em.getTransaction().commit();
        System.out.println("Update "+emp);

        //remove an employee
        em.getTransaction().begin();
        employeeService.removeEmployee(123);
        em.getTransaction().commit();
        System.out.println("Removed Employee 123");
        emp = null;

        em.close();
        emf.close();
    }
}