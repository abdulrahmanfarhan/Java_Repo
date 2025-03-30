package edu.zuj.term.extra;
import java.util.Scanner;
public class TimeZoneConverter {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        long totalMilliseconds = System.currentTimeMillis();
        long totalseconds = totalMilliseconds / 1000 ;
        
        long totalminits = totalseconds / 60 ;
        long reminingseconds = totalseconds % 60 ;
        
        long totalhours = totalminits / 60 ;
        long reminingminits = totalminits % 60 ;
        System.out.print("Enter the time zone offset to GMT: ");
        long timeZone = input.nextLong();
        
        long remininghouers = (totalhours % 24) + timeZone ;

        System.out.println(remininghouers + " : " + reminingminits + " : " + reminingseconds );
        
    }
}
