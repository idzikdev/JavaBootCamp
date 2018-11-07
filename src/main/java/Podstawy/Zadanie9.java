package Podstawy;

import java.util.Scanner;

/**
 * Napisz program, który odczytuje dwie zmienne i na ekran wypisuje komunikat
 sprawdzający czy obie zmienne są równe
 *
 * Created by operator on 13.02.2017.
 */
public class Zadanie9 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        double firstNumber=scanner.nextDouble();
        System.out.println("Enter second number");
        double secondNumber=scanner.nextDouble();
        if (firstNumber==secondNumber){
            System.out.print("The variables have the same value");
        }
        else{
            System.out.print("The variables have different values");
        }
        scanner.close();
    }
}
