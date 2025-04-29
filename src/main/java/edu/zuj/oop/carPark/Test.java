package edu.zuj.oop.carPark;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        CarPark carParkArray[] = new CarPark[3];
        for (int i = 0; i < carParkArray.length; i++) {
            System.out.println("---------------------------");
            System.out.println("This is a car park number " + (i + 1));
            System.out.println("---------------------------");
            carParkArray[i] = fillArrayOfObjects();
        }

        for (int i = 0; i < carParkArray.length; i++) {
            System.out.println(carParkArray[i]);
        }
    }

    public static CarPark fillArrayOfObjects() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the park Zone :");
        String parkZone = s.nextLine();
        System.out.print("Enter the time :");
        int time = s.nextInt();
        s.nextLine(); // Clear newline after nextInt()
        System.out.print("Enter the type (R/V)");
        char type = s.next().charAt(0);

        return new CarPark(parkZone, time, type);
    }
}
