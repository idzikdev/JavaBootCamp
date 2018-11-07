package Kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by operator on 01.07.2017.
 */
public class Book implements Comparable <Book>{
    private String title;
    private int pages;
    private double price;

    public Book(String title, int pages, double price) {
        super();
        setTitle(title);
        setPages(pages);
        setPrice(price);
    }


    @Override
    public String toString() {
        return "Book [title=" + title + ", pages=" + pages + ", price=" + price + "]";
    }


    public static void main(String[] args) {
        List<Book> lista = new ArrayList<Book>();
        Book[] books = { new Book("Z-Rambo", 1113, 25.56), new Book("Rocky", 999, 45.99),
                new Book("Transporter", 1234, 56.78) };
        lista.addAll(Arrays.asList(books));
        Collections.sort(lista);
        System.out.println("Sortowanie po tytule");
        for(Book el:lista){
            System.out.println(el);
        }
        System.out.println("------------");
        System.out.println("Sortowanie po ilości stron");
        Collections.sort(lista, new ComparatorPageCount());
        for(Book el:lista){
            System.out.println(el);
        }
        System.out.println("------------");
        System.out.println("Sortowanie po cenie");
        Collections.sort(lista, new ComparatorPrice());
        for(Book el:lista){
            System.out.println(el);
        }
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public int getPages() {
        return pages;
    }


    public void setPages(int pages) {
        if (pages>0) this.pages = pages;
        else this.pages=0;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        if (price>0)this.price = price;
        else price=0;
    }


    @Override
    public int compareTo(Book book) {
        if (this.getTitle().compareTo(book.getTitle())<0) return -1;
        else if (this.getTitle().compareTo(book.getTitle())>0) return 1;
        return 0;
    }

}
