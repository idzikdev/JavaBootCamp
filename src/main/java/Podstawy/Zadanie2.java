package Podstawy;

import java.util.Scanner;

/**
 * Napisz program, który odczytuje 2 zmienne i zamienia je.
 *
 * Created by operator on 10.02.2017.
 */
public class Zadanie2 {
    public static void main(String [] args){
        System.out.println("-----------------The program reads 2 variables and reverse them-----------------");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber=scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber=scanner.nextInt();
        int tempNumber=firstNumber;
        firstNumber=secondNumber;
        secondNumber=tempNumber;
        System.out.println("After reverse first number is "+firstNumber);
        System.out.println("After reverse second number is "+secondNumber);
        scanner.close();
    }
}
