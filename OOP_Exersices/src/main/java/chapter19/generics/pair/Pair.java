package chapter19.generics.pair;

public class Pair<E> {
    private final E first;
    private final E second;

    private Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }
    
    public static <E> Pair<E> of(E first, E second){
        return new Pair<>(first, second);
    }
    
    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }
}
