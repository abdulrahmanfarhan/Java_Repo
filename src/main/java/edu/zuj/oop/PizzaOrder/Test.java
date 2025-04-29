package edu.zuj.oop.PizzaOrder;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        PizzaOrder p1 = new PizzaOrder();
        fillObj(p1);
        PizzaOrder p2 = new PizzaOrder();
        fillObj(p2);
        PizzaOrder p3 = new PizzaOrder();
        fillObj(p3);
        PizzaOrder p4 = new PizzaOrder();
        fillObj(p4);
        PizzaOrder p5 = new PizzaOrder();
        fillObj(p5);
        PizzaOrder p6 = new PizzaOrder();
        fillObj(p6);
        PizzaOrder p7 = new PizzaOrder();
        fillObj(p7);

    }

    public static void fillObj(PizzaOrder p) {
        System.out.println("-----------------------");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the pizza Type :");
        String type = s.nextLine();
        System.out.println("Enter the quantity:");
        int q = s.nextInt();
        s.nextLine();
        System.out.println("Enter the size:");
        char c = s.next().charAt(0);

        p.setPizzaType(type);
        p.setQuantity(q);
        p.setSize(c);
    }
}
