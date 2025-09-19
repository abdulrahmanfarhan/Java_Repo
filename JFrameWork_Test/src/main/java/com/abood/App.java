package com.abood;

public class App {
    public static void main(String[] args) {
        JKDataAccess da = JKDataAccessFactory.getDataAccessService();
        if (!da.isTableExists("PERSON")) {
            da.runScript("/script.sql");
        }
        JKWebApplication.run(8080);
    }
}
