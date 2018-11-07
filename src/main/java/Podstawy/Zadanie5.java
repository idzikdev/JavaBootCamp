package Podstawy;

import java.util.Scanner;

/**
 * Stwórz program, który odczytuje wiek danej osoby i wypisuję na ekran komunikat
 czy dana osoba jest pełnoletnia czy niepełnoletnia.
 *
 * Created by operator on 13.02.2017.
 */
public class Zadanie5 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ile masz lat?");
        int age=scanner.nextInt();
        if (age>=18) {
            System.out.print("Jesteś osobą pełnoletnią");
        }
        else {
            System.out.print("Nie jesteś osobą pełnoletnią");
        }
        scanner.close();
    }
}
