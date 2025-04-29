package edu.zuj.oop.elevator;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Elevator elevatorArray[] = new Elevator[4];
        for (int i = 0; i < elevatorArray.length; i++) {
            System.out.println("----------------------");
            System.out.println("---- Elevator (" + (i + 1) + ") ----");
            elevatorArray[i] = fillElevator();
        }
        printArray(elevatorArray);
    }

    public static Elevator fillElevator() {
        Scanner s = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.print("Enter the speed:");
        char speed = s.next().charAt(0);
        System.out.print("Enter the floors:");
        int floors = s.nextInt();

        return new Elevator(speed, floors);
    }

    public static void printArray(Elevator e[]) {
        System.out.println("----------------------");
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].toString());
        }
    }
}
