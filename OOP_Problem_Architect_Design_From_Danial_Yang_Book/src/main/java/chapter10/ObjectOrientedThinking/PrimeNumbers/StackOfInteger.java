package chapter10.ObjectOrientedThinking.PrimeNumbers;

/**
 *
 * @author Abdulrahman
 */
public class StackOfInteger {
    
    private int elements[];
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfInteger() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfInteger(int capacity) {
        elements = new int[capacity];
    }

    public boolean empty() {
        return size == 0;
    }

    public int peek() {
        return elements[size - 1];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size] = value;
        size++;
    }

    public int pop() {
        return elements[--size];
    }

    public int getSize() {
        return size;
    }
}
