package Podstawy;

import java.util.Scanner;

/**
 * Napisz program, który odczytuje napis i wypisuje go wspak
 *
 * Created by operator on 13.02.2017.
 */
public class Zadanie12 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.nextLine();
        System.out.println("The contrariwise of "+name+" is "+new StringBuilder(name).reverse().toString());
        scanner.close();
    }
}
