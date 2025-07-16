package chapter11.InheritanceAndPolymorphism.BinPacking;

public class Bin {

    int[] weights = new int[10];
    int index = 0;

    public boolean add(int weight) {
        if (sumOfWeights() + weight <= 10) {
            weights[index++] = weight;
            return true;
        }
        return false;
    }

    private int sumOfWeights() {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += weights[i];
        }
        return sum;
    }

    public void printContents(int binNumber) {
        System.out.print("Container " + binNumber + " contains objects with weight: ");
        for (int i = 0; i < index; i++) {
            System.out.print(weights[i] + " ");
        }
        System.out.println();
    }
}
