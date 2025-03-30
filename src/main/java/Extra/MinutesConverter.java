package edu.zuj.term.extra;
import java.util.Scanner;
public class MinutesConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes : ");
        long minits = input.nextLong();
        
        long day = minits / 1440 ;
        long year = day / 365;
        long reminingday = day % 365 ;
        
        System.out.println(year +" year");
        System.out.println(reminingday +" day");
    }
    
}
