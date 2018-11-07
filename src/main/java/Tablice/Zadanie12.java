package Tablice;

import java.util.HashMap;

/**
 * https://codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
 * 66% rozwiązanie na codility
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie12 {
    public static int solution(int[] tab) {
        HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>();
        int result = 0;
        for (int i = 0; i < tab.length; i++) {
            if (mapa.containsKey(tab[i]))
                mapa.replace(tab[i], mapa.get(tab[i]) + 1);
            else
                mapa.put(tab[i], 1);
        }
        for (Integer klucz : mapa.keySet()) {
            Integer value = mapa.get(klucz);
            if (value == 1)
                result = klucz;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] tablica = { 4, 3, 4, 8, 3, 5, 5 };
        System.out.println(solution(tablica));
    }
}
