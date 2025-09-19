package com.abood.dao;

import com.abood.model.Employee;
import com.jk.core.util.JK;
import com.jk.data.dataaccess.orm.JKObjectDataAccess;

import java.util.List;

public class dao {
    private static Integer id;

    public static void insert(JKObjectDataAccess da) {
        Employee emp = new Employee();
        emp.setName("Jalal")
                .setAge(30)
                .setPhoneNumber("0799999999")
                .setEmail("jalal@example.com");

        id = da.insert(emp).getId(); // بعد الإدخال يرجع ID
    }

    public static void find(JKObjectDataAccess da) {
        Employee emp = da.find(Employee.class, id);
        JK.printBlock(emp);
    }

    public static void update(JKObjectDataAccess da) {
        Employee emp = da.find(Employee.class, id);
        emp.setName("Updated " + emp.getName());
        da.update(emp);
    }

    public static void getAll(JKObjectDataAccess da) {
        List<Employee> list = da.getList(Employee.class);
        for (Employee emp : list) {
            JK.printBlock(emp);
        }
    }

    public static void delete(JKObjectDataAccess da) {
        da.delete(Employee.class, id);
    }
}
