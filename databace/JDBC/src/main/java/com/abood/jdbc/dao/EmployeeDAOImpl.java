package com.abood.jdbc.dao;

import com.abood.jdbc.model.Employee;
import com.abood.jdbc.util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public void save(Employee employee) throws SQLException {
        if (employee.getId() <= 0) {
            insert(employee);
        } else {
            update(employee);
        }
    }

    private void insert(Employee employee) throws SQLException {
        String query = "INSERT INTO employee (name, age, phone_number, email) VALUES (?,?,?,?)";
        try (
                Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)
        ) {
            statement.setString(1, employee.getName());
            statement.setInt(2, employee.getAge());
            statement.setString(3, employee.getPhoneNumber());
            statement.setString(4, employee.getEmail());

            statement.executeUpdate();

            try (ResultSet rs = statement.getGeneratedKeys()) {
                if (rs.next()) {
                    employee.setId(rs.getInt(1));
                }
            }
        }
    }

    private void update(Employee employee) throws SQLException {
        String query = "UPDATE employee SET name = ?, age = ?, phone_number = ?, email = ? WHERE id = ?";
        try (
                Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)
        ) {
            statement.setString(1, employee.getName());
            statement.setInt(2, employee.getAge());
            statement.setString(3, employee.getPhoneNumber());
            statement.setString(4, employee.getEmail());
            statement.setInt(5, employee.getId());

            statement.executeUpdate();
        }
    }

    @Override
    public List<Employee> getAllEmployees() throws SQLException {
        List<Employee> employeeList = new ArrayList<>();
        String query = "SELECT * FROM employee";
        try (
                Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery()
        ) {
            while (resultSet.next()) {
                employeeList.add(EmployeeMapper(resultSet));
            }
        }
        return employeeList;
    }

    @Override
    public Employee findEmployeeById(int id) throws SQLException {
        String query = "SELECT * FROM employee WHERE id = ?";
        try (
                Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)
        ) {
            statement.setInt(1, id);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    return EmployeeMapper(rs);
                }
            }
        }
        return null;
    }

    @Override
    public void delete(int id) throws SQLException {
        String query = "DELETE FROM employee WHERE id = ?";
        try (
                Connection connection = DatabaseConnection.getConnection();
                PreparedStatement statement = connection.prepareStatement(query)
        ) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }

    private static Employee EmployeeMapper(ResultSet rs) throws SQLException {
        return new Employee(
                rs.getString("name"),
                rs.getInt("age"),
                rs.getString("phone_number"),
                rs.getString("email")).setId(rs.getInt(1));
    }
}
