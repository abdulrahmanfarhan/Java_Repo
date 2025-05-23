package edu.zuj.oop.rectangle;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Rectangle rec[] = new Rectangle[3];
        for (int i = 0; i < rec.length; i++) {
            System.out.println("----------");
            System.out.println("Enter the vlues for rectangle " + (i + 1));
            rec[i] = makeRectangle();
        }
        System.out.println("----------");
        for (int i = 0; i < rec.length; i++) {
            System.out.println((i + 1) + ": " + rec[i].toString());
        }
    }

    public static Rectangle makeRectangle() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length = s.nextDouble();
        System.out.print("Enter the width: ");
        double width = s.nextDouble();
        System.out.print("Enter the color of rectangle: ");
        String color = s.next();
        System.out.print("is the rectangle have a border (Y/N)");
        boolean border = false;
        switch (s.next().charAt(0)) {
            case 'Y':
                border = true;
                break;
            case 'y':
                border = true;
                break;
        }
        return new Rectangle(length, width, color, border);
    }
}
