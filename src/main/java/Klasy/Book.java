package Klasy;

/**
 * Created by operator on 25.02.2017.
 */
public class Book {
    private String author;
    private int pages;
    private String title;
    public Book(String author, int pages, String title) {
        super();
        this.author = author;
        this.pages = pages;
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "Book [author=" + author + ", pages=" + pages + ", title=" + title + "]";
    }
}

