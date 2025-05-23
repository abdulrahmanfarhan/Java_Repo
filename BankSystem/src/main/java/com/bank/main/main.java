package com.bank.main;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("=====  Welcome  =====\n");
        System.out.print(" Enter the bank name: ");
        Bank_UI bank = new Bank_UI(s.nextLine());
        bank.start();
    }
}
