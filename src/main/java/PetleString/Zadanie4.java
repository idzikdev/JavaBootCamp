package PetleString;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Napisz program, który sprawdza czy dany odczytany napis jest w
 * poprawnym formacie kodu pocztowego tzn: 87-630 jest w formacie poprawnym,
 * natomiast 8aa-999 jest niepoprawnym kodem pocztowym ( dwie pierwsze cyfry
 * następni myślnik, następnie trzy cyfry).
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your post code");
        if (Pattern.matches("[0-9]{2}-[0-9]{3}", scanner.nextLine()))
            System.out.println("Post code is valid");
        else System.out.println("Post code is invalid");

    }
}
