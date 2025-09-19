package com.abood.jdbc.dao;

import com.abood.jdbc.model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

    //contains both create and update, more detail in implementation
    void save(Employee employee) throws SQLException;

    List<Employee> getAllEmployees() throws SQLException;

    Employee findEmployeeById(int id) throws SQLException;

    void delete(int id) throws SQLException;

}