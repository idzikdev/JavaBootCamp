package PetleString;

import java.util.Scanner;

/**
 * Stwórz program, który sprawdza czy wprowadzone imię jest męskie czy
 * żeńskie.
 * Created by operator on 25.02.2017.
 */
public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        if (scanner.nextLine().endsWith("a"))
            System.out.print("This is female name");
        else
            System.out.print("This is male name");
    }
}
