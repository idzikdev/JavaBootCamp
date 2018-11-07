package Metody;

/**
 * Skorzystaj z wcześniejszej funkcji (zad.11.) do znalezienia liczby od 2 do 10000, która ma
 największą liczbę dzielników
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie12 {
    public static void main(String[] args) {
        int maxLiczba = 2;
        int liczba = 2;
        for (int i = 3;i < 10000;i++) {
            if (numberOfDividers(i) > maxLiczba) {
                maxLiczba = numberOfDividers(i);
                liczba = i;
            }
        }
        System.out.println("Number " + liczba + " has " + maxLiczba + " dividers");

    }

    public static int numberOfDividers(int number) {
        int suma = 2;
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                suma++;
        }
        return suma;
    }
}

