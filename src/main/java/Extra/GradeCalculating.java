package Extra;

import java.util.Scanner;

public class GradeCalculating {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the grade in 3 corses from 100: ");
        System.out.print("1 :");
        double one = input.nextDouble();
        System.out.print("2 :");
        double two = input.nextDouble();
        System.out.print("3 :");
        double three = input.nextDouble();

        double grade = (one + two + three) / 3;

        System.out.print("Passed ???? ");
        System.out.println(grade >= 50);

        if (grade >= 50) {
            System.out.println("you'r passed!, you'r grade is " + grade);

        } else {
            System.out.println("you'r not passed, you'r grade is: " + grade);
        }

    }
}
