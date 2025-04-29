package edu.zuj.oop.computer;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Computer arr[] = new Computer[5];
        System.out.println("----------Welcome----------");

        //fill objects detailes
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the details for computer " + (i + 1));
            System.out.println("----------");
            arr[i] = fillValue();
            System.out.println("----------");
        }

        //print toString() for computers that have ram, gratter than 16
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getRam() >= 16) {
                System.out.println(arr[i].toString());
            }
        }

    }

    //A Static method for fill value
    public static Computer fillValue() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the computer brand: ");
        String brand = s.next();
        System.out.print("Enter the computer processor: ");
        String processor = s.next();
        System.out.print("Enter the copmuter ram: ");
        int ram = s.nextInt();

        return new Computer(brand, processor, ram);
    }
}
