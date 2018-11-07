package Podstawy;

import java.util.Scanner;

/**
 * Napisz program, który wypisuje co drugą literę imienia.
 *
 * Created by operator on 13.02.2017.
 */
public class Zadanie13 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.nextLine();
        for (int i = 1; i < name.length(); i=i+2) {
            System.out.print(name.charAt(i));
        }
        scanner.close();
    }
}
