package chapter11.InheritanceAndPolymorphism.perfectSquar;

import java.util.ArrayList;

import java.util.Collections;

public class PerfectSquareFinder extends Factorial {

    public PerfectSquareFinder(int m) {
        super(m);
    }

    public int findSmallestN() {
        ArrayList<Integer> factors = getFactorsList();

        Collections.sort(factors);

        ArrayList<Integer> finalNum = new ArrayList<>();
        int i = 0;

        while (i < factors.size()) {
            int current = factors.get(i);
            int count = 0;

            while (i < factors.size() && factors.get(i) == current) {
                count++;
                i++;
            }

            if (count % 2 != 0) {
                finalNum.add(current);
            }
        }

        int n = 1;
        for (int factor : finalNum) {
            n *= factor;
        }

        return n;
    }
}
