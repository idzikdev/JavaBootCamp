package Kolekcje;

import java.util.Comparator;

/**
 * Created by operator on 01.07.2017.
 */
public class ComparatorPageCount implements Comparator<Book> {

    @Override
    public int compare(Book book1, Book book2) {
        if (book1.getPages()<book2.getPages())
            return -1;
        else if (book1.getPages()>book2.getPages())
            return 1;
        return 0;
    }

}