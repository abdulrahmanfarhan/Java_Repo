package com.abood;

import com.abood.model.Employee;
import com.jk.data.dataaccess.JKDataAccessFactory;
import com.jk.data.dataaccess.orm.JKObjectDataAccess;

public class TestApp {
    public static void main(String[] args) {
        JKObjectDataAccess da = JKDataAccessFactory.getObjectDataAccessService();

        Employee emp = new Employee();
        emp.setName("JFramework-JPA")
                .setAge(28)
                .setPhoneNumber("0788888888")
                .setEmail("abood@example.com");

        Employee saved = da.insert(emp);

    }
}