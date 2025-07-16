package chapter12.ExceptionHandling.WriteData;

import java.io.File;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws java.io.IOException {
        File f = new File("text.txt");
        PrintWriter wrter = new PrintWriter(f);
        for (int i = 0; i <= 100; i++) {
            wrter.println("My name is Abdulrahman farhan" + i*2);
            System.out.println("******"+i+"******");
        }
        wrter.close();
    }
}
