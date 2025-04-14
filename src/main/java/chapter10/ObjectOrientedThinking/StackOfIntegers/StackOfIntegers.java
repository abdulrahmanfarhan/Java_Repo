package chapter10.ObjectOrientedThinking.StackOfIntegers;

/**
 *
 * @author Abdulrahman
 */
public class StackOfIntegers {

    private int[] elements = new int[100];
    private int size;

    public StackOfIntegers() {
        this(16);
    }

    public StackOfIntegers(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        return elements[size - 1];
    }

    public void push(int value) {
        elements[size++] = value;
    }

    public int pop() {
        int top = elements[size - 1];
        size--;
        return top;
    }

    public int getSize() {
        return size;
    }
}
