package PetleString;

import java.util.Scanner;

/**
 * Napisz program, który odczytuje liczbę i sprawdza ile dana liczba ma dzielników.
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number");
        int number=scanner.nextInt();
        int dividors=2;
        for (int i=2;i<=number-1;i++){
            if (number%i==0) dividors=dividors+1;
        }
        System.out.println("The number of dividors is "+dividors);
    }
}
