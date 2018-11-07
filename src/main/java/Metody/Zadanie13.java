package Metody;

/**
 * Napisz funkcję, która odczytuje a i n i zwraca a do potęgi n.
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie13 {
    public static void main(String[] args) {
        System.out.println(potega(2, 10));
   }

    public static double potega(double a, double n) {
        return Math.pow(a,n);
    }
}
