package com.abood.the900;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int a[] = new int[s.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
            sum += a[i];
        }
        sum /= 2;
        Arrays.sort(a);
        int sum2 = 0;
        int i;
        for (i = (a.length - 1); i >= 0; i--) {
            if (sum2 <= sum) {
                sum2 += a[i];
            } else {
                break;
            }
        }
        System.out.println(a.length - 1 - i);
    }
}
