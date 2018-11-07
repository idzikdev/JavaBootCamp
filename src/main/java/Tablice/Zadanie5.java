package Tablice;

/**
 * Dla tablicy liczb całkowitych znajdź jednocześnie minimum i maksimum tablicy
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie5 {
    public static void main(String[] args) {
        int [] tab={4,5,3,6,7,8,2,1,4,3};
        int min=tab[0];
        int max=tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]<min) min=tab[i];
            if (tab[i]>max) max=tab[i];
        }
        System.out.println("Minimum element "+min);
        System.out.println("Maximum element "+max);

    }
}
