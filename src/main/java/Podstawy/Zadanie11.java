package Podstawy;

import java.util.Scanner;

/**
 * Napisz program, który odczytuje imię i sprawdza czy jest ono palindromem.
 *
 * Created by operator on 13.02.2017.
 */
public class Zadanie11 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.nextLine();
        if (name.equals(new StringBuilder(name).reverse().toString())){
            System.out.println("The word "+name+" is palindrome");
        }
        else{
            System.out.println("The word "+name+" is not palindrome");
        }
        scanner.close();
    }
}
