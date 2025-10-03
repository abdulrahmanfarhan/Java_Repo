package com.abood.the1300;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistrationSystem {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        Map<String, Integer> database = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = s.nextLine().trim();
            if (!database.containsKey(name)){
                System.out.println("OK");
                database.put(name, 0);
            } else {
                int count = database.get(name);
                String newName = name + (count+1);

                while (database.containsKey(newName)){
                    count++;
                    newName = name + count;
                }

                System.out.println(newName);
                database.put(name, count);
                database.put(newName, 0);
            }
        }
    }
}