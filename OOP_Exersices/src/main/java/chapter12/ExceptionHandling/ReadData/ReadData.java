package chapter12.ExceptionHandling.ReadData;

import java.io.File;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args) throws Exception {
        File f = new File("file.txt");
        Scanner input = new Scanner(f);
        while (input.hasNext()) {
            for (int i = 0; i < 5; i++) {
                System.out.print(input.next()+" ");
            }
            System.out.println();
        }
        input.close();
    }
}
