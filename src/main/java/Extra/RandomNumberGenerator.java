package chapter9.objects_classes.ExtraProblemsAndCode;

/*
(Use the Random class)
Write a program that creates 
a Random object with seed 1000
and displays the first 50 random integers 
between 0 and 100 using the nextInt(100) method.
 */
import java.util.Random;

public class RandomNumberGenerator {

    public static void main(String[] args) {
        Random r = new Random(1000);

        for (int i = 1; i <= 100; i++) {
            System.out.print(r.nextInt(100) + " ");
            if (i % 10 == 0) {
                System.out.println("");
            }
        }
    }
}
