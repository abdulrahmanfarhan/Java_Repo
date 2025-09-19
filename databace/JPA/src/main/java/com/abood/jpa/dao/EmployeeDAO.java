package com.abood.jpa.dao;

import com.abood.jpa.model.Employee;
import java.util.List;

public interface EmployeeDAO {
    Employee save(Employee employee);

    Employee findEmployee(int id);

    void updateEmployee(Employee employee);

    List<Employee> findAllEmployees();

}
