package Podstawy;

import java.util.Scanner;

/**
 * Napisz program, który odczytuję imię i wypisuję na ekran ostatnią literę imienia.
 *
 * Created by operator on 13.02.2017.
 */
public class Zadanie10 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.nextLine();
        System.out.println("The last letter is "+name.charAt(name.length()-1));
        scanner.close();
    }
}
