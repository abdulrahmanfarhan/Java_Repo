package com.abood.jdbc;

import com.abood.jdbc.dao.EmployeeDAO;
import com.abood.jdbc.dao.EmployeeDAOImpl;
import com.abood.jdbc.model.Employee;

public class App {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();

        try {
            // 1. Add a new employee with name "tet"
            Employee emp = new Employee("tet", 25, "0791234567", "tet@example.com");
            employeeDAO.save(emp);
            System.out.println("Employee added: " + emp.getName() + " with ID: " + emp.getId());

            // 2. Update the employee name to "JDBC"
            emp.setName("JDBC");
            employeeDAO.save(emp);
            System.out.println("Employee updated to: " + emp.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
