package edu.zuj.oop.smartphone;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Smartphone phonesArray[] = new Smartphone[5];
        System.out.println("--------------------");
        for (int i = 0; i < phonesArray.length; i++) {
            System.out.println("---Smartphone-(" + (i + 1) + ")----");
            System.out.println("--------------------");
            phonesArray[i] = fillArrayByObjects();
        }
        printArray(phonesArray);
    }

    public static Smartphone fillArrayByObjects() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the brand :");
        String brand = s.next();
        System.out.println("Enter the storage :");
        int storage = s.nextInt();

        return new Smartphone(brand, storage);
    }

    public static void printArray(Smartphone a[]) {
        System.out.println("--------------------");
        for (int i = 0; i < a.length; i++) {
            if (a[i].getBrand().equalsIgnoreCase("Apple") && a[i].getStorage() >= 512) {
                System.out.println(a[i]);
            }
        }
    }
}
