package chapter19.generics.WildCardNeed;

import chapter19.generics.genericStack.GenericStack;

public class WildCardNeed {

    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        System.out.println("The Max Integer is : " + max(intStack));
    }

    public static double max(GenericStack<? extends Number> list) {
        double max = list.pop().doubleValue();

        while (!list.isEmpty()) {
            double value = list.pop().doubleValue();

            if (value > max) {
                max = value;
            }

        }

        return max;
    }

}
