package com.abood.problemsolving.zuj;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int distance = 0;

            for (int j = 0; j < a.length; j++) {
                if (j == i) {
                    continue;
                }
                distance = Math.abs(a[i] - a[j]);
                min = Math.min(distance, min);
                max = Math.max(distance, max);
            }
            System.out.println(min+" "+max);
        }

    }
}
