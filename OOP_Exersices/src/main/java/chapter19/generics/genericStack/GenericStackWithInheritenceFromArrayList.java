package chapter19.generics.genericStack;

import java.util.ArrayList;

public class GenericStackWithInheritenceFromArrayList<E> extends ArrayList<E>{

    public void push(E o){
        add(o);
    }
    
    public E pop(){
        if (isEmpty()) {
            return null;
        }
        return remove(size() - 1);
    }
    
    public E peek(){
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }
    
    public boolean isEmpty(){
        return size() == 0;
    }
    
    public int getSize(){
        return size();
    }
    
}
