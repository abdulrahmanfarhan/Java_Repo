package Extra;

import java.util.Scanner;

public class ArraySumMax {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("how many numbers?");
        int n = s.nextInt();
        int a[] = new int[n];
        int sum = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter then number " + (i + 1)+" :");
            a[i] = s.nextInt();
            sum += a[i];
            if (i == 0) {
                max = a[0];
            } else {
                max = (a[i] > max) ? a[i] : max;
            }
        }
        System.out.println("The sum is:" + sum);
        System.out.println("The max is:" + max);
    }
}