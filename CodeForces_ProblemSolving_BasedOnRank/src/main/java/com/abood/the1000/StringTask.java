package com.abood.the1000;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a= s.nextLine().trim().toLowerCase();
        s.close();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)!='a' &&  a.charAt(i)!='e' && a.charAt(i)!='o' && a.charAt(i)!='i' && a.charAt(i)!='u' && a.charAt(i)!='y') {
                stringBuilder.append(".").append(a.charAt(i));
            }
        }
        System.out.println(stringBuilder);
    }
}
