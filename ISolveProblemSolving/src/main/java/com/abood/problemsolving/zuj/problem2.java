package com.abood.problemsolving.zuj;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i= 0; i<n; i++){
            int[] a = new int[3];
            for (int j = 0; j<a.length; j++){
                a[j]= s.nextInt();
            }
            boolean is = a[0] == a[1] + a[2];
            if (a[1]==a[0]+a[2]){
                is = true;
            }
            if (a[2]==a[0]+a[1]){
                is = true;
            }
            System.out.println(is? "YES" : "NO");
        }
    }
}
