package com.abood;

import com.abood.DAO.EmployeeDAO;
import com.abood.DAO.EmployeeDAOImplementation;
import com.abood.module.Employee;
import com.abood.module.Gender;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            EmployeeDAO dao = new EmployeeDAOImplementation();

            Calendar cal = Calendar.getInstance();
            cal.set(2000, Calendar.JANUARY, 1);
            Employee newEmployee = new Employee(0, "TestUser", Gender.MALE,
                    new Date(cal.getTimeInMillis()), 500.0);
            dao.save(newEmployee);
            System.out.println("Saving employee done, id: " + newEmployee);

            Employee found = dao.findEmployeeById(newEmployee.getId());
            System.out.println("Employee founded :" + found);

            found.setName("UpdatedUser");
            found.setSalary(1000.0);
            dao.save(found);
            System.out.println("Updating employee " + found);

            List<Employee> employees = dao.getAllEmployee();
            System.out.println("Employee list: ");
            for (Employee emp : employees) {
                System.out.println(emp);
            }

            dao.delete(found.getId());
            System.out.println("Saving an employee with id : " + found.getId());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}