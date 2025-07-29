package chapter19.generics.genericStack;

import java.util.ArrayList;

public class GenericStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    public GenericStack() {
    }

    public int getSize() {
        return list.size();
    }

    public E peek() {
        return list.get(getSize() - 1);
    }

    public void push(E o) {
        list.add(o);
    }

    public E pop() {
        E o = peek();
        list.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Stack: " + list.toString();
    }
}
