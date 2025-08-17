package chapter19.generics.genericStack;

public class GenericStackByArray<E> {

    private E[] elements;
    private int size = 0;

    @SuppressWarnings("unchecked")
    public GenericStackByArray() {
        elements = (E[]) new Object[10];
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[size - 1];
    }

    public void push(E o) {
        //Expanding the array size, since the array has fixed length
        if (size == elements.length) {
            expandCapacity();
        }
        //Updating The Index Of Array and adding the new element
        elements[size++] = o;
    }

    public E pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        E o = elements[--size];
        elements[size] = null;
        return o;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")
    public void expandCapacity() {
        E[] newElements = (E[]) new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("stack: [");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
