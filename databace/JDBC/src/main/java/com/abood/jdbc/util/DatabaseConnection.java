package com.abood.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String HOST = "localhost";
    private static final int PORT = 3306;
    private static final String DB_NAME = "mydb";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "abdulrahman-farhan@2004";
    private static final String URL = String.format(
            "jdbc:mysql://%s:%d/%s",
            HOST, PORT, DB_NAME
    );

    public DatabaseConnection() {}

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
