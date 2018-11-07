package Metody;

/**
 * Napisz funkcję, która ma trzy parametry formalne a, b, c będące liczbami całkowitymi.
 Funkcja zwraca prawdę, jeśli zadane liczby są liczbami pitagorejskimi oraz fałsz w
 przeciwnym wypadku. Liczby pitagorejskie spełniają warunek: a*a+b*b=c*c.
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie5 {
    public static void main(String[] args) {
        if (czyPitagoras(3, 4, 5))
            System.out.println("TAK");
        else
            System.out.println("NIE");

    }

    public static boolean czyPitagoras(int a, int b, int c) {
        if (a * a + b * b ==c * c)
            return true;
        return false;
    }
}
