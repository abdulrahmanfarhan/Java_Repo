package chapter10.ObjectOrientedThinking.FirstFit;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of Items: ");
        int numberOfItems = s.nextInt();

        int[] weights = new int[numberOfItems];
        fillArray(weights);

        FirstFit f = new FirstFit(weights);
        ArrayList<ArrayList<Integer>> packedBoxes = f.firstFit();

        printArrayList(packedBoxes);
        System.out.println("Total number of containers used: " + packedBoxes.size());
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the weight for item num. " + (i + 1) + ": ");
            arr[i] = s.nextInt();
        }
        System.out.println("==============================");
        System.out.println("-----------Thank You----------");
    }

    public static void printArrayList(ArrayList<ArrayList<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Box Number " + (i + 1) + ":");
            System.out.println("\tItems:");
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.println("\t" + (j + 1) + ". " + list.get(i).get(j));
            }
        }
        System.out.println("==============================");
    }
}
