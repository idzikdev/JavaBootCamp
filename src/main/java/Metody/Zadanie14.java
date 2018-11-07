package Metody;

/**
 * Napisz funkcję, która odczytuje 2 liczby i zwraca NWD (a,b)
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie14 {
    public static void main(String[] args) {
        System.out.println(nwd(48, 9));
    }

    public static int nwd(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b- a;
        }
        return a;
    }
}
