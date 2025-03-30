package edu.zuj.term.extra;
import java.util.Scanner;
public class A0GeniusCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = (int)(System.currentTimeMillis() % 10) ;
        int num2 = (int)(System.currentTimeMillis() /10 %10);
        
        System.out.print("What is " + num1 + " + " + num2 +" = ");
        int result = input.nextInt(); 
        System.out.println(num1 + " + " + num2 +" = " + result + " Is " +(num1+num2==result));
        if (num1+num2==result) {
        System.out.print("Thank You!");
        }
        else {
        System.out.print("The Correct is " + (num1+num2));
        }
        
    }
}
