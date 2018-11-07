package Metody;

/**
 * Napisz funkcję, która stwierdza, czy zadana jako parametr liczba całkowita jest
 liczbą pierwszą.
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie8 {
    public static void main(String[] args) {
        if (isPrime(8))
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");

    }

    public static boolean isPrime(int number) {
        boolean tak = true;
        for (int i = 2; i <= (int) Math.sqrt(number); i++) {
            if (number % i== 0) {
                tak = false;
                break;
            }
        }
        if (!tak)
            return false;
        return true;
    }
}

