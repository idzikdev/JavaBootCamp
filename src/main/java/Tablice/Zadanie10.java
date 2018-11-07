package Tablice;

import java.util.Random;

/**
 * Wprowadź liczby całkowite do dwuwymiarowej tablicy liczb o wymiarach n wierszy i m
 kolumn (n i m zadeklarowane jako stałe w programie) oraz oblicz sumę wyrazów w tablicy.
 Znajdź minimum i maksimum w wierszach tablicy dwuwymiarowej.
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie10 {
    public static void main(String[] args) {
        int n=10;
        int m=10;
        Random losuj=new Random();
        int [][] tab=new int[n][m];
        int sum=0;
        for (int i = 0; i < tab.length; i++) {
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            for (int j = 0; j < tab.length; j++) {
                tab[i][j]=losuj.nextInt(100);
                sum=sum+tab[i][j];
                if (tab[i][j]<min) min=tab[i][j];
                if (tab[i][j]>max) max=tab[i][j];
            }
            System.out.println("Minimum element in row "+i+" is "+min);
            System.out.println("Maximum element in row "+i+" is "+max);
            System.out.println("--------------------------------------");
        }
        System.out.println("Sum "+sum);

    }
}
