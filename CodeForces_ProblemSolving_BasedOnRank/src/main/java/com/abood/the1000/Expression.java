package com.abood.the1000;

import java.util.Scanner;
public class Expression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int result1 = a * b * c;
        int result2 = (a + b) * c;
        int result3 = a + (b * c);
        int result4 = (a * b) + c;
        int result5 = a * (b + c);
        int result6 = a + b + c;

        int max = Math.max(Math.max(result1, result2), Math.max(result3, result4));
        int max2 = Math.max(max, Math.max(result5, result6));
        System.out.println(max2);
    }
}
