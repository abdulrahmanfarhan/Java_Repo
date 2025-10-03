package chapter11.InheritanceAndPolymorphism.perfectSquar;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int m = s.nextInt();
        PerfectSquareFinder finder = new PerfectSquareFinder(m);
        int n = finder.findSmallestN();
        System.out.println("The smallest number n for m * n to be a perfect square is: " + n);
        System.out.println("m * n = " + (m * n));
    }
}
