package WyrazeniaRegularne;

import java.util.regex.Pattern;

/**
 * Czy pierwsze trzy znaki są dowolne, zaś następne 3 znaki tylko cyframi?
 *
 * Czy string zawiera tylko cyfry?
 * Czy string zawiera tylko litery?
 * Czy string zawiera tylko cyfry i litery?
 * Czy string zawiera tylko cyfry i ma dokładnie 5 znaków?
 * Czy string rozpoczyna się od "J"?
 * Czy string rozpoczyna się od "J" i kończy na "U"?
 * Czy string rozpoczyna się od wielkiej litery?
 * Czy string zawiera spację? (biały znak)?
 * Czy string jest numerem telefonu zaczynającym się od 7 lub 8 lub 9?
 * Czy string jest numerem bankowym? (Zakładając, że zaczyna się od dwóch liter, następnie 4 grupy po 4 cyfry)
 * Czy string jest kodem pocztowym?
 * Created by operator on 20.06.2017.
 */
public class Wyrazenia {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".{3}[0-9]{3}","abc345")); //Czy pierwsze trzy znaki są dowolne, zaś następne 3 znaki tylko cyframi?
        System.out.println(Pattern.matches("[0-9]+","545")); //Czy string zawiera tylko cyfry?
        System.out.println(Pattern.matches("[a-zA-z]+","a")); //Czy string zawiera tylko litery?
        System.out.println(Pattern.matches("\\w+","3443dfdf"));//Czy string zawiera tylko cyfry i litery?
        System.out.println(Pattern.matches("[0-9]{5}","12345"));//Czy string zawiera tylko cyfry i ma dokładnie 5 znaków?
        System.out.println(Pattern.matches("J.*","J"));//Czy string rozpoczyna się od "J"?
        System.out.println(Pattern.matches("J.*U","J5UUU"));//Czy string rozpoczyna się od "J" i kończy na "U"?
        System.out.println(Pattern.matches("[A-Z].*","Ala"));//Czy string rozpoczyna się od wielkiej litery?
        System.out.println(Pattern.matches(".*\\p{Space}.*","g  g"));//Czy string zawiera spację? (biały znak)?
        System.out.println(Pattern.matches("[7-9][0-9]{8}","777777777"));//Czy string jest numerem telefonu zaczynającym się od 7 lub 8 lub 9?
        System.out.println(Pattern.matches("[a-zA-Z]{2}([0-9]{4}){4}","ab1234123412341234"));//Czy string jest numerem bankowym? (Zakładając, że zaczyna się od dwóch liter, następnie 4 grupy po 4 cyfry)
        System.out.println(Pattern.matches("[0-9]{2}-[0-9]{3}","20-533"));//Czy string jest kodem pocztowym?
    }
}
