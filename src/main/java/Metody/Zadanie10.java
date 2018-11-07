package Metody;

/**
 * Napisz funkcję, która wyznacza maksimum z dwóch zadanych liczb całkowitych. Wartością
 funkcji ma być większa spośród liczb.
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie10 {
    public static void main(String[] args) {
        System.out.println(maxNumber(10, 12));
    }

    public static int maxNumber(int first, int second) {
        return Integer.max(first,second);
    }
}

