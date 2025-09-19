package com.abood.jpa;

import com.abood.jpa.dao.EmployeeDAOImpl;
import com.abood.jpa.model.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmployeeService");
        EntityManager em = emf.createEntityManager();

        EmployeeDAOImpl dao = new EmployeeDAOImpl(em);
        Employee emp = new Employee("JPA", 22, "0785423589", "abdulrahmanfarhan@gmsil.com");
        dao.save(emp);
        emp.setName("JPA");
        dao.updateEmployee(emp);

        em.close();
        emf.close();
    }
}
