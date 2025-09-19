package com.abood.jframweork.jdbc;

import com.abood.jframweork.jdbc.dao.DataAccess;
import com.abood.jframweork.jdbc.dao.EmployeeDAO;
import com.abood.jframweork.jdbc.dao.EmployeeDAOImpl;
import com.abood.jframweork.jdbc.model.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        DataAccess dataAccess = new DataAccess();
        dataAccess.delete(2);
        Employee person1 = new Employee().setName("Abdulrahman").setAge(20).setPhoneNumber("516221").setEmail("abood@gmail.com");
        System.out.println(person1.getName());
        person1.setName("JFramework_JDBC");
        dataAccess.add(person1);
        System.out.println(person1.getId());
        //dataAccess.update(person1);
        System.out.println(person1.getName());
    }
}