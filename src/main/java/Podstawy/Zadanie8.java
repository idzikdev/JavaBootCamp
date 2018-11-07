package Podstawy;

import java.util.Scanner;

/**
 * Napisz program, który oblicza silnię.
 *
 * Created by operator on 13.02.2017.
 */
public class Zadanie8 {
    public static void main(String [] args){
        long factorial=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        long number=scanner.nextLong();
        for (int i = 2; i <= number; i++) {
            factorial=factorial*i;
        }
        System.out.println("The factorial of "+number+" is "+factorial);
        scanner.close();
    }
}
