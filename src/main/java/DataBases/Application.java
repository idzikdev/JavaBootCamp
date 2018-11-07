package DataBases;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Created by operator on 28.06.2017.
 */
public class Application {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choose;
        do {
            System.out.println("1-add user\n2-add book\n3-delete user\n4-delete book\n5-show users");
            choose= Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    addUser();
                    break;
                case 2:
                    addBook();
                    break;
                default:break;
            }
        }
        while(choose!=0);
        scanner.close();
    }
    public static void addUser(){
        try {
            Scanner read = new Scanner(System.in);
            System.out.println("Please enter name : ");
            String name = read.nextLine();
            System.out.println("Please enter surname :");
            String surname = read.nextLine();
            System.out.println("Please enter telephone");
            String telephone = read.nextLine();
            read.close();
            UserDao userDao=new UserDao();
            userDao.addUser(new User(name,surname,telephone));
        }
        catch (NoSuchElementException e){
            e.getMessage();
        }
    }
    public static void addBook(){
        try {
            Scanner read = new Scanner(System.in);
            System.out.println("Please enter title : ");
            String title = read.nextLine();
            System.out.println("Please enter author :");
            String author = read.nextLine();
            System.out.println("Please enter published year");
            String year = read.nextLine();
            read.close();
            BookDao bookDao=new BookDao();
            bookDao.addBook(new Book(title,author,Integer.parseInt(year)));
        }
        catch (NoSuchElementException e){
            e.getMessage();
        }

    }
}
