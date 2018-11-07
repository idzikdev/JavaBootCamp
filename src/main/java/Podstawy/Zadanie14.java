package Podstawy;

import java.util.Scanner;

/**
 * Napisz program, który odczytuje dany wyraz z konsoli tak długo aż natrafi na
 poprawnie wprowadzone hasło.
 * Created by operator on 13.02.2017.
 */
public class Zadanie14 {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        String passwd="12345";
        String name;
        do{
            System.out.println("Please enter password");
            name=scanner.nextLine();
        }
        while (!name.equals(passwd));
        System.out.print("The password is correct");
        scanner.close();
    }
}
