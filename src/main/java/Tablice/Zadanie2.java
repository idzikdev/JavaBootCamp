package Tablice;

/**
 * W tablicy jednowymiarowej przechowującą liczby całkowite znaleźć liczbę minimalną ciągu.
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie2 {
    public static void main(String[] args) {
        int [] tab = {4,3,1,-1,0};
        int min=tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (tab[i]<min) min=tab[i];
        }
        System.out.println("The minimum is "+min);

    }
}
