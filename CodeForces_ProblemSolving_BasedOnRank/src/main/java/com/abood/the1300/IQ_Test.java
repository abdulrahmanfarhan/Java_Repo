package com.abood.the1300;

import java.util.Scanner;
public class IQ_Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[s.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        int evenIndex = -1;
        int oddIndex = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] %2 == 0) {
                evenCount++;
                evenIndex = i+1;
            }
            else {
                oddCount++;
                oddIndex = i+1;
            }
        }
        if (evenCount == 1) System.out.println(evenIndex);
        else System.out.println(oddIndex);
    }
}
