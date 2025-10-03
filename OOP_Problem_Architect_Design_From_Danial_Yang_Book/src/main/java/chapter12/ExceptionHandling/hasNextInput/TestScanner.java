package chapter12.ExceptionHandling.hasNextInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");
        Scanner input = new Scanner(file);
        int count = 1;
        int sum = 0;
        while (input.hasNext()) {
            String firstName = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println((count) + "." + firstName + " " + lastName + " " + score);
            count++;
            sum += score;
        }
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");

        double avg = sum / count;
        System.out.println("Thhe average = " + avg);

        input.close();
    }
}
