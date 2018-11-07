package Generics;

/**
 * Created by operator on 05.07.2017.
 */
public class Pair<S, I> {
    S first;
    I last;

    public Pair(S first, I last) {
        this.first = first;
        this.last = last;
    }

    public S getFirst() {
        return first;
    }

    public I getLast() {
        return last;
    }

    public void setFirst(S first) {
        this.first = first;
    }

    public void setLast(I last) {
        this.last = last;
    }
}
