package chapter10.ObjectOrientedThinking.FirstFit;

import java.util.ArrayList;

public class FirstFit {

    private int[] weights;
    public final static int CONTAINER_SIZE = 10;
    private ArrayList<ArrayList<Integer>> Boxes = new ArrayList<>();

    public FirstFit(int[] weights) {
        this.weights = weights;
    }

    public int getNumberOfItems() {
        return weights.length;
    }

    public int[] getWeights() {
        return weights;
    }

    public static int getCONTAINER_SIZE() {
        return CONTAINER_SIZE;
    }

    public ArrayList<ArrayList<Integer>> firstFit() {
        for (int i = 0; i < weights.length; i++) {
            fill(weights[i]);
        }

        return Boxes;
    }

    private void fill(int weight) {
        for (ArrayList<Integer> box : Boxes) {
            if (getSumOfWeights(box) + weight <= CONTAINER_SIZE) {
                box.add(weight);
                return;
            }
        }

        ArrayList<Integer> newBox = new ArrayList<>();
        newBox.add(weight);
        Boxes.add(newBox);
    }

    private int getSumOfWeights(ArrayList<Integer> box) {
        int sum = 0;
        for (int i = 0; i < box.size(); i++) {
            sum += box.get(i);
        }

        return sum;
    }
}
