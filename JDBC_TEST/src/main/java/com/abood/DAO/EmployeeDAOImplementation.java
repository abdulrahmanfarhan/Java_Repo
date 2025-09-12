package com.abood.DAO;

import com.abood.module.Employee;
import com.abood.module.Gender;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImplementation implements EmployeeDAO {

    public List<Employee> getAllEmployee() throws SQLException {
        String query = "SELECT * FROM employee";
        List<Employee> employeeList = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery();) {

            while (resultSet.next()) {
                int getId = resultSet.getInt("id");
                String getName = resultSet.getString("name");
                Gender getGender = resultSet.getBoolean("gender") ? Gender.MALE : Gender.FEMALE;
                double getSalary = resultSet.getDouble("salary");
                Date getDate = resultSet.getDate("birth_date");

                Employee employee = new Employee(getId, getName, getGender, getDate, getSalary);
                employeeList.add(employee);
            }
        }
        return employeeList;
    }

    @Override
    public Employee findEmployeeById(int id) throws SQLException {
        String query = "SELECT * FROM employee WHERE id = ?";
        Employee employee = null;

        try (
                Connection connection = DatabaseConnection.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery()) {
            preparedStatement.setInt(1, id);

            while (resultSet.next()) {
                int getId = resultSet.getInt("id");
                String getName = resultSet.getString("name");
                Gender getGender = resultSet.getBoolean("gender") ? Gender.MALE : Gender.FEMALE;
                double getSalary = resultSet.getDouble("salary");
                Date getDate = resultSet.getDate("birth_date");

                employee = new Employee(getId, getName, getGender, getDate, getSalary);
            }

        }
        return employee;
    }

    @Override
    public void save(Employee employee) throws SQLException {
        if (employee.getId() <= 0) {
            String query = "INSERT INTO employee (name, gender, birth_date, salary) VALUES (?, ?, ?, ?)";
            try (
                    Connection connection = DatabaseConnection.getConnection();
                    PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ) {
                statement.setString(1, employee.getName());
                statement.setBoolean(2, employee.getGender() == Gender.MALE);
                statement.setDate(3, employee.getBirthDate());
                statement.setDouble(4, employee.getSalary());
                statement.executeUpdate();

                try (ResultSet resultSet = statement.getGeneratedKeys()) {
                    if (resultSet.next()) {
                        employee.setId(resultSet.getInt(1));
                    }
                }
            }
        } else {
            String query = "UPDATE employee SET name=?, gender=?, birth_date=?, salary=? WHERE id=?";
            try (Connection connection = DatabaseConnection.getConnection();
                 PreparedStatement preparedStatement = connection.prepareStatement(query);
            ) {
                preparedStatement.setString(1, employee.getName());
                preparedStatement.setBoolean(2, Gender.MALE == employee.getGender());
                preparedStatement.setDate(3, employee.getBirthDate());
                preparedStatement.setDouble(4, employee.getSalary());
                preparedStatement.setInt(5, employee.getId());

                preparedStatement.executeUpdate();
            }
        }
    }

    @Override
    public void delete(int id) throws SQLException {
        String query = "DELETE FROM employee WHERE id = ?";
        try (
                Connection connection = DatabaseConnection.getConnection();
                PreparedStatement stm = connection.prepareStatement(query)
        ) {
            stm.setInt(1, id);
            stm.executeUpdate();
        }
    }
}
