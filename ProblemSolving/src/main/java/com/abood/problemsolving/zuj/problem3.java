package com.abood.problemsolving.zuj;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(s.nextInt()-1);
        }

    }
}