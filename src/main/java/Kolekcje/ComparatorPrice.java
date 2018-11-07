package Kolekcje;

import java.util.Comparator;

/**
 * Created by operator on 01.07.2017.
 */
public class ComparatorPrice implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        if (book1.getPrice()<book2.getPrice())
            return -1;
        else if (book1.getPrice()>book2.getPrice())
            return 1;
        return 0;
    }

}
