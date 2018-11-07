package Generics;

/**
 * Created by operator on 05.07.2017.
 */
public class TestPair {

    public static void main(String[] args) {
        Pair<String, Integer> pg = new Pair<String, Integer>("Jan", 3);
        System.out.println(pg.getFirst() + " " + pg.getLast());
        String name = pg.getFirst();
        int m = pg.getLast();
        pg.setFirst(name + " Kowalski");
        pg.setLast(m + 1);
        System.out.println(pg.getFirst() + " " + pg.getLast());
    }

}