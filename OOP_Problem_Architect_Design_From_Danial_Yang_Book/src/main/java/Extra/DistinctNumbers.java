package Extra;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("======= Hello =======");
        ArrayList<Integer> list = new ArrayList<>();
        int value;
        do {
            System.out.println("Enter the number: (input ends with 0)");
            value = s.nextInt();
            if (!list.contains(value) && value != 0) {
                list.add(value);
            }
        } while (value != 0);

        System.out.println("========== ^_^ ==========");
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                System.out.print(list.get(i) + " ,");
            } else {
                System.out.print(list.get(i));
            }
        }
        System.out.println("");
        System.out.println("=========================");
        System.out.println("====== Abdulrahman ======");
        System.out.println("=========================");

    }
}
