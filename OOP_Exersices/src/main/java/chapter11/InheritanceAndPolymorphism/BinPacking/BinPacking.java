package chapter11.InheritanceAndPolymorphism.BinPacking;

import java.util.ArrayList;
import java.util.Scanner;

public class BinPacking {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n;) {
            System.out.print("Enter weight of object " + (i + 1) + ": ");
            int weight = s.nextInt();
            if (weight > 10) {
                System.out.println("Weight too large! Must be ≤ 10.");
                continue;
            }
            arr[i++] = weight;
        }

        ArrayList<Bin> bins = new ArrayList<>();

        for (int weight : arr) {
            boolean placed = false;
            for (Bin bin : bins) {
                if (bin.add(weight)) {
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                Bin newBin = new Bin();
                newBin.add(weight);
                bins.add(newBin);
            }
        }

        for (int i = 0; i < bins.size(); i++) {
            bins.get(i).printContents(i + 1);
        }
    }
}
