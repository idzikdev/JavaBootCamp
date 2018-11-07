package Metody;

/**
 * Napisz funkcję, która wyznacza sumę cyfr zadanej liczby całkowitej
 * *
 * Created by operator on 25.02.2017.
 */
public class Zadanie6 {
    public static void main(String[] args) {
        System.out.println(sumaCyfr(4567));
    }

    public static int sumaCyfr(int liczba) {
        String liczbaString = String.valueOf(liczba);
        int suma = 0;
        for (int i = 0; i < liczbaString.length(); i++) {
            suma = suma + Integer.parseInt(liczbaString.charAt(i) +"");
        }
        return suma;
    }
}
