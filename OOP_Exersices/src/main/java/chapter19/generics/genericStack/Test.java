package chapter19.generics.genericStack;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GenericStack<String> list = new GenericStack<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter the city number " + (i+1));
            list.push(s.nextLine());
        }

        System.out.println(list.toString());
    }
}
