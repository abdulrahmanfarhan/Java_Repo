package chapter19.generics.genericStack;

import java.util.Scanner;

public class GenericMethodDemo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        Integer[] list = new Integer[s.nextInt()];
        s.nextLine();
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) System.currentTimeMillis() % 100;
            System.out.println("Adding " + list[i] + " Success, press Enter...");
            s.nextLine();
        }
        System.out.println("Now We Will Call Print Method, press enter...");
        s.nextLine();
        print(list);
    }

    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println("+---------+");
            System.out.printf("| %-7s |\n", list[i]); // %-7s يعني محاذاة لليسار داخل 7 خانات
        }
        System.out.println("+---------+");
        System.out.println();
    }

}
