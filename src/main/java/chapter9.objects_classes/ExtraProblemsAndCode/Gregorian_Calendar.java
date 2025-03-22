package chapter9.objects_classes.ExtraProblemsAndCode;

import java.util.GregorianCalendar;

public class Gregorian_Calendar {

    public static void main(String[] args) {
        GregorianCalendar g = new GregorianCalendar();
        g.setTimeInMillis(1234567898765L);
        System.out.println("The Current year is: " + g.get(GregorianCalendar.YEAR));
        System.out.println("The Current Month is: " + (g.get(GregorianCalendar.MONTH) + 1));
        System.out.println("The Current Day is: " + g.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println("---------------");
        
    }
}
