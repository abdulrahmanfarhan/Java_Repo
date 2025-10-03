package com.datastrctures.chapter20;

import java.util.ArrayList;

public class TestCollectios {
    public static void main(String[] args) {
        ArrayList<String> colliction1 = new ArrayList<>();
        colliction1.add("Amman");
        colliction1.add("New York");
        colliction1.add("Taxes");
        colliction1.add("Dallas");
        colliction1.add("Los Angles");

        System.out.print("A list of cities is :");
        System.out.println(colliction1);

        System.out.println("\nis Dallas in Collectoin1 ?"+colliction1.contains("Dallas"));
        if (colliction1.contains("Dallas")){
            System.out.println("Then we will remove it.");
            colliction1.remove("Dallas");
        } else {
            System.out.println("Ok its not exist!");
        }

        System.out.println("The colliction2 size is :"+colliction1.size());

        ArrayList<String> colliction2 = new ArrayList<>();
        colliction2.add("New York");
        colliction2.add("Irbid");
        colliction2.add("Aqaba");
        colliction2.add("london");

        System.out.print("A list of cities is :");
        System.out.println(colliction2);

        System.out.println("\nis aqaba in Collectoin1 ?"+colliction1.contains("aqaba"));
        if (colliction1.contains("aqabq")){
            System.out.println("Then we will remove it.");
            colliction1.remove("aqaba");
        } else {
            System.out.println("Ok its not exist!");
        }

        ArrayList<String> c1 = (ArrayList<String>) colliction1.clone();
        c1.addAll(colliction2);
        System.out.println("Collection1 + Collection2");
        System.out.println("The c1 Collection after union: "+c1);

        c1 = (ArrayList<String>) colliction1.clone();
        c1.retainAll(colliction2);
        System.out.println("Collection1 - Collection2");
        System.out.println("The c1 Collection after retain: "+c1);
    }
}
