package chapter11.InheritanceAndPolymorphism.perfectSquar;

import java.util.ArrayList;

public class Factorial {

    protected int m;

    public Factorial(int m) {
        this.m = m;
    }

    public ArrayList<Integer> getFactorsList() {
        ArrayList<Integer> factors = new ArrayList<>();
        int number = m;

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }

        return factors;
    }
}