package com.abood.DAO;

import com.abood.module.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployee() throws SQLException;

    Employee findEmployeeById(int id) throws SQLException;

    void save(Employee employee) throws SQLException;

    void delete(int id) throws SQLException;
}
