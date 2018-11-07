package Kolekcje;

import java.util.Comparator;

/**
 * Created by operator on 01.07.2017.
 */
public class ComparatorPersonHeight implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getHeight()<p2.getHeight()) return -1;
        else if (p1.getHeight()>p2.getHeight()) return 1;
        return 0;
    }

}
