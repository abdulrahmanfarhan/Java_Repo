package com.abood.jpa.dao;

import com.abood.jpa.model.Employee;
import jakarta.persistence.EntityManager;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    protected EntityManager entityManager;

    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Employee save(Employee employee) {
            entityManager.getTransaction().begin();
            entityManager.persist(employee);
            entityManager.getTransaction().commit();
            return employee;
    }

    @Override
    public Employee findEmployee(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public void updateEmployee(Employee employee) {
        Employee emp = findEmployee(employee.getId());
        emp.setName(employee.getName())
                .setAge(employee.getAge())
                .setEmail(employee.getEmail())
                .setPhoneNumber(employee.getPhoneNumber());
    }

    @Override
    public List<Employee> findAllEmployees() {
        entityManager.getTransaction().begin();
        List<Employee> employeeList = entityManager
                .createQuery("SELECT e FROM Employee e", Employee.class)
                .getResultList();

        entityManager.getTransaction().commit();

        return employeeList;
    }
}
