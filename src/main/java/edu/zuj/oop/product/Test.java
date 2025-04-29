package edu.zuj.oop.product;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Product pArr[] = new Product[3];
        for (int i = 0; i < pArr.length; i++) {
            pArr[i] = new Product();
            fillValue(pArr[i]);
        }
        for (int i = 0; i < pArr.length; i++) {
            printProduct(pArr[i]);
        }

    }

    public static void fillValue(Product p) {
        Scanner s = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("Enter the Product Name:");
        String name = s.next();
        System.out.println("Enter the priduct catagery:");
        String catagery = s.next();
        System.out.println("Enter the price:");
        int price = s.nextInt();
        System.out.println("Enter the quantity in stock:");
        int quantityInStock = s.nextInt();
        p.setpName(name);
        p.setpCategory(catagery);
        p.setPrice(price);
        p.setQuantityInStock(quantityInStock);
    }

    public static void printProduct(Product p) {
        if (p.getPrice() > 10) {
            System.out.println(p.toString());
        }
    }
}
