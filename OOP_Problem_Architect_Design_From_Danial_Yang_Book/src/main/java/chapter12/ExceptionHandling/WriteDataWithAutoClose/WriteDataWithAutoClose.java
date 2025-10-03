package chapter12.ExceptionHandling.WriteDataWithAutoClose;

import java.io.File;
import java.io.PrintWriter;

public class WriteDataWithAutoClose {

    public static void main(String[] args) throws Exception {
        File file = new File("source.txt");

        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }

        try (
                PrintWriter output = new PrintWriter(file)) {
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }

        //auto close
    }
}
