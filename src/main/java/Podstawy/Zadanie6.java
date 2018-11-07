package Podstawy;

import java.util.Scanner;

/**
 * Stwórz program, który odczytuję daną liczbę i sprawdza czy jest podzielna przez 4
 *
 * Created by operator on 13.02.2017.
 */
public class Zadanie6 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=scanner.nextInt();
        if (number%4==0){
            System.out.println("The number is divisible by four");
        }
        else {
            System.out.println("The number is not divisible by four");
        }
        scanner.close();
    }
}
