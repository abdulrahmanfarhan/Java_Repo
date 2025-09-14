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
        Employee emp = employeeService.creatEmployee("John", 2000);
        em.getTransaction().commit();

        System.out.println("Persisted :" + emp);

        // find a specific employee
        emp = employeeService.findEmployee(emp.getId());
        System.out.println("Found :" + emp);

        // find all employees
        List<Employee> emps = employeeService.findAllEmployees();
        for (Employee e : emps) {
            System.out.println(e);
        }


        // update Employee
        em.getTransaction().begin();
        emp = employeeService.raiseEmployeeSalary(emp.getId(), 1000);
        em.getTransaction().commit();
        System.out.println("Update " + emp);


        boolean toTurrnRemovingOddAndCheckDB = true;
        if (toTurrnRemovingOddAndCheckDB) {
            //remove an employee
            int id = emp.getId();
            em.getTransaction().begin();
            employeeService.removeEmployee(emp.getId());
            em.getTransaction().commit();
            System.out.println("Removed Employee whith id +\"" + id + "\"");
            emp = null;
        }

        em.close();
        emf.close();
    }
}