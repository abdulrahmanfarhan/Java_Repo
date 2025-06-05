package com.bank.main;

//import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.print("=======  Welcome  =======\n");
        /*
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the bank name: ");
        Bank_UI bank = new Bank_UI(s.nextLine());
         */
        
        Bank_UI B1 = new Bank_UI("National");
        B1.start();
    }
}
