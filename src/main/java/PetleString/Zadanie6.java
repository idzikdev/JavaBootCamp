package PetleString;

import java.util.Scanner;

/**
 * Stwórz program, który odczytuję dany napis i wypisuje ile razy w danym
 * napisie występują małe litery.
 * Przykładowo dla napisu:
 * aAaaBssk wynikiem powinno być 6 (małe a występuje 3 razy, s występuje 2 razy, k
 * występuje 1 raz).
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter string");
        String input=scanner.nextLine();
        int lower=0;
        int upper=0;
        for (int i=0;i<input.length();i++){
            if (input.charAt(i)>='a' && input.charAt(i)<='z')
                lower++;
            if (input.charAt(i)>='A' && input.charAt(i)<='Z')
                upper++;
        }
        System.out.println("The total number od lowercase letters is "+lower);
        System.out.println("The total number od UPPERcase letters is "+upper);
    }
}
