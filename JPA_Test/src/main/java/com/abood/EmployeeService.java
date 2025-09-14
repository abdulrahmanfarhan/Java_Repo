package com.abood;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class EmployeeService {
    protected EntityManager entityManager;

    public EmployeeService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Employee creatEmployee(int id, String name, long salary){
        Employee emp = new Employee(id);
        emp.setName(name);
        emp.setSalary(salary);
        entityManager.persist(emp);
        return emp;
    }

    public Employee findEmployee(int id){
        return entityManager.find(Employee.class, id);
    }
    public void removeEmployee(int id){
        Employee emp = findEmployee(id);
        if (emp != null){
            entityManager.remove(emp);
        }
    }

    public Employee raiseEmployeeSalary(int id, double num){
        Employee emp = findEmployee(id);
        if (emp != null) {
            emp.setSalary(emp.getSalary()+(long)num);
        }
        return emp;
    }

    public List<Employee> findAllEmployees(){
        TypedQuery<Employee> query = entityManager.createQuery(
                "SELECT e FROM Employee", Employee.class
        );
        return query.getResultList();
    }
}
