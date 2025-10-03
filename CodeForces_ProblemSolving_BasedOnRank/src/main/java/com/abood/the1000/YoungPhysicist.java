package com.abood.the1000;

import java.util.Scanner;
public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int x = 0;
        int y = 0;
        int z = 0;

        for (int i = 0; i < n; i++) {
            x+= s.nextInt();
            y+= s.nextInt();
            z+= s.nextInt();
        }

        if (x==0 && y==0 && z==0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
