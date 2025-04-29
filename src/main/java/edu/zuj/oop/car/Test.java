package edu.zuj.oop.car;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Car carArray[] = new Car[4];
        for (int i = 0; i < carArray.length; i++) {
            carArray[i] = new Car();
            System.out.println("-------------------------------------");
            System.out.println("---Fill the car number(" + (i + 1) + ") information");
            fill(carArray[i]);
        }

        printArrayOfObjects(carArray);
    }

    public static void fill(Car c) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the brand:");
        String brand = s.next();
        System.out.println("Enter the (year):");
        int year = s.nextInt();
        System.out.println("Enter the model :");
        String model = s.next();
        System.out.println("Enter the price :");
        double price = s.nextDouble();

        c.setAllData(brand, model, year, price);
    }

    public static void printArrayOfObjects(Car c[]) {
        for (int i = 0; i < c.length; i++) {
            if (c[i].getPrice() >= 20000) {
                System.out.println(c[i].toString());
            }
        }
    }
}
