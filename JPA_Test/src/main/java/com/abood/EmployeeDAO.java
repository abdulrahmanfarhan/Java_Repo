package com.abood;

import jakarta.persistence.EntityManager;

import java.util.List;

public class EmployeeDAO {
    private EntityManager em;

    public EmployeeDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Employee e) {
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
    }

    public List<Employee> findAll() {
        return em.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
    }
}

