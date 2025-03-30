package edu.zuj.term.extra;
import java .util.Scanner;
public class SavingsAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of monthly part : ");
        double monthlyPart = input.nextDouble();
        
        double first = monthlyPart *( 1 + 0.003125);
        double second = (monthlyPart + first ) * (1 + 0.003125);
        double third = (monthlyPart + second) * (1 + 0.003125);
        double fourd = (monthlyPart + third) * (1 + 0.003125);
        double fifth = (monthlyPart + fourd) * (1 + 0.003125);
        double sixth = (monthlyPart + fifth) * (1 + 0.003125);
        
        System.out.println("After the first month : " + first);
        System.out.println("After the second month : " + second);
        System.out.println("After the third month : " + third);
        System.out.println("After the sixth month : " + sixth);
        
    }
}
