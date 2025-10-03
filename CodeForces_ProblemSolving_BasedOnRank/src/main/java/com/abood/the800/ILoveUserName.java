package com.abood.the800;

import java.util.Scanner;

public class ILoveUserName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();

        int max = s.nextInt();
        int min = max;
        int result = 0;
        for (int i = 1; i < number; i++) {
            int n=0;
            if ((n = s.nextInt()) > max) {
                max = n;
                result++;
            } else if (n < min) {
                min = n;
                result++;
            }
        }
        System.out.println(result);
    }
}
