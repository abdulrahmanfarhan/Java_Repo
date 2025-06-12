package chapter10.ObjectOrientedThinking.Queue;

import java.util.NoSuchElementException;

public class Queue {

    private int[] elements;
    private int size;

    public Queue() {
        elements = new int[8];
        size = 0;
    }

    public void enQueue(int v) {
        if (size < elements.length) {
            elements[size++] = v;
        } else {
            int tempElements[] = new int[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                tempElements[i] = elements[i];
            }
            elements = tempElements;
            tempElements = null;
            enQueue(v);
        }
    }

    public int deQueue() {
        if (size != 0) {

            int number = elements[0];
            for (int i = 0; i < elements.length - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[elements.length - 1] = 0;
            size--;
            return number;
        } else {
            throw new NoSuchElementException("The Queue is empty.");
        }
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
