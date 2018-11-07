package Metody;

/**
 * Napisz funkcję, która odczytuje jako argument liczbę i wypisuje liczbę dzielników
 * *
 * Created by operator on 25.02.2017.
 */
public class Zadanie11 {
    public static void main(String[] args) {
        System.out.println(numberOfDividers(8));
    }

    public static int numberOfDividers(int number) {
        int suma = 2;
        for (int i = 2; i < number;i++) {
            if (number % i == 0)
                suma++;
        }
        return suma;
    }
}
