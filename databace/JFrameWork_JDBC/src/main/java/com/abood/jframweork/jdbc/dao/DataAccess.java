package com.abood.jframweork.jdbc.dao;

import com.abood.jframweork.jdbc.model.Employee;
import com.jk.data.dataaccess.JKDataAccessFactory;
import com.jk.data.dataaccess.core.JKDataAccess;
import com.jk.data.dataaccess.core.JKUpdater;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DataAccess {
    JKDataAccess service = JKDataAccessFactory.getDataAccessService();

    public void add(Employee employee) {
        String sql = "INSERT INTO employee (name, age, phone_number, email) VALUES (?, ?, ?, ?)";

        // executeUpdate سترجع المفتاح الجديد تلقائيًا إذا كانت قاعدة البيانات تدعم auto-increment
        Object newId = service.executeUpdate(sql, employee.getName(), employee.getAge(),
                employee.getPhoneNumber(), employee.getEmail());

        if (newId != null) {
            employee.setId(((Number) newId).intValue());
        }
    }

    public Employee find(int id) {
        return service.find("SELECT * FROM employee WHERE id=?", this::EmployeeMapper, id);
    }

    public boolean delete(int id) {
        return service.execute("DELETE FROM employee WHERE id=?", id) == 1;
    }

    public boolean update(Employee employee) {
        String sql = "UPDATE employee SET name=?,age=?,phone_number=?,email=? WHERE id=?";
        int records = service.execute(sql, employee.getName(), employee.getAge(), employee.getPhoneNumber(),
                employee.getEmail(), employee.getId());
        return records == 1;
    }

    public List<Employee> getAll() {
        return service.getList("SELECT * FROM employee", this::EmployeeMapper);
    }

    protected Employee EmployeeMapper(ResultSet rs) throws SQLException {
        Employee employee = new Employee();
        employee.setId((Integer) rs.getObject("id"));
        employee.setName((String) rs.getObject("name"));
        employee.setAge((Integer) rs.getObject("age"));
        employee.setPhoneNumber((String) rs.getObject("phone_number"));
        employee.setEmail((String) rs.getObject("email"));
        return employee;
    }
}
