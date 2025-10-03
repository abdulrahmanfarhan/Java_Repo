package com.abood.the1100;

import java.util.Arrays;
import java.util.Scanner;

public class InterestingDrink {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] stores = new int[s.nextInt()];
        for (int i = 0; i < stores.length; i++) stores[i] = s.nextInt();
        Arrays.sort(stores);

        int monyPerDay = s.nextInt();
        for (int i = 0; i < monyPerDay; i++) {
            System.out.println(binarySearch(stores, s.nextInt()));
        }
    }
    private static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= key) low = mid + 1;
            else high = mid;
        }
        return low;
    }
}