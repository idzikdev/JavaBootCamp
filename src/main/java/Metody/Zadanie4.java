package Metody;

/**
 * Napisz funkcję divide wyznaczającą iloraz dwóch zadanych liczb całkowitych. Działanie
 funkcji sprawdź pisząc odpowiedni program
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie4 {
    public static void main(String[] args) {
        int number1=5;
        int number2=2;
        if (number2!=0)System.out.println(divide(number1, number2));
        else System.out.println("Division by zero!");
    }

    public static int divide(int first, int second) {
        return first/second;
    }
}
