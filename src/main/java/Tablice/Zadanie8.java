package Tablice;

import java.util.Scanner;

/**
 * Zuzia lubi zadania matematyczne. Ostatnio dowiedziała się, że  X mod Y to reszta z dzielenia X przez Y.
 * Poprosiła Antka, żeby jej podał 15 liczb, a ona szybko obliczy, ile jest różnych reszt z dzielenia tych liczb przez 37. Pomóż Zuzi wykonać zadanie.
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie8 {
    public static void main(String[] args) {
        int [] numbers={13,34,12,56,15,16,17,21,34,56,67,69,100,11,111,222};
        int [] tab = new int[37];
        for (int i = 0; i < numbers.length; i++) {
             tab[numbers[i] % 37] ++;
        }
        int sum=0;
        for (int i=0;i<tab.length;i++){
            if (tab[i]>0)
                sum++;
        }
        System.out.println("The various dividors is "+sum);
    }
}
