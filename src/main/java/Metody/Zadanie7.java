package Metody;

/**
 * Napisz funkcję, która stwierdza, czy zadana jako parametr liczba całkowita jest kwadratem
 pewnej liczby całkowitej. Liczby będące kwadratami liczb całkowitych to 1, 4, 9, 16 itd.
 Wartością funkcji ma być prawda, jeśli liczba spełnia warunek oraz fałsz w przeciwnym
 wypadku.
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie7 {
    public static void main(String[] args) {
        if (isSquare(9))
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    public static boolean isSquare(int number) {
        boolean yes = false;
        for (int i = 1; i < number;i++) {
            if (i * i == number) {
                yes = true;
                break;
            }
        }
        if (yes)
            return true;
        return false;
    }
}
