package com.abood;

import com.abood.DAO.EmployeeDAO;
import com.abood.DAO.EmployeeDAOImplementation;
import com.abood.module.Employee;
import com.abood.module.Gender;

import java.sql.SQLException;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws SQLException {

        EmployeeDAO DAO = new EmployeeDAOImplementation();

        Calendar cal = Calendar.getInstance();
        cal.set(2025, Calendar.MAY, 27);

        // نخزن الأرقام كـ String عشان نحتفظ بصيغة +962
        Set<String> existingNumbers = new HashSet<>();
        for (Employee employee : DAO.getAllEmployee()) {
            existingNumbers.add(employee.getName()); // ما في داعي parseInt
        }

        int total = 1000; // عدد الموظفين المطلوب إضافتهم
        for (int i = 0; i < total; i++) {
            boolean done = false;
            int attempts = 0;
            while (!done && attempts < 100) {
                attempts++;
                int number = ThreadLocalRandom.current().nextInt(780000000, 790000000);
                String phone = "+962" + number;

                if (!existingNumbers.contains(phone)) {
                    DAO.save(new Employee(0, phone, Gender.FEMALE, cal.getTime(), 0));
                    existingNumbers.add(phone);
                    done = true;
                }
            }

            // حساب النسبة المئوية
            if ((i + 1) % (total / 100) == 0) {
                int percent = (i + 1) * 100 / total;
                for (int b = 0; b< 5; b++){
                    System.out.println();
                }
                System.out.println("------------------------------------------------");
                for (int b = 0; b< 5; b++){
                    System.out.println();
                }
                System.out.println("          "+percent + "%");
                for (int b = 0; b< 5; b++){
                    System.out.println();
                }
                System.out.println("------------------------------------------------");
            }
        }
    }
}
