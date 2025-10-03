package com.abood.the1000;

import java.util.Scanner;
public class TheatreSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long h = s.nextLong();
        long w = s.nextLong();
        long a = s.nextLong();

        System.out.println(((h + a - 1) / a) * ((w + a - 1) / a));
    }
}
