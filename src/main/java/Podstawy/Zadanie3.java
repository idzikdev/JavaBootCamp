package Podstawy;

import java.util.Scanner;

/**
 * Napisz program, który odczytuje liczbę typu double i na ekran wypisuje całkowitą
 wartość tej liczby
 *
 * Created by operator on 13.02.2017.
 */
public class Zadanie3 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter double value");
        double number=scanner.nextDouble();
        System.out.println("Integer value is "+(int)number);
        scanner.close();
    }
}
