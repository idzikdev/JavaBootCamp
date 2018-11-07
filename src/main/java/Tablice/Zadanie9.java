package Tablice;

/**
 * Dana jest liczba naturalna n z przedziału 1 do 100, ciąg n liczb całkowitych oraz liczba
 całkowita k. Napisz program, który wyznaczy ilość wystąpień liczby k w podanym ciągu liczb.
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie9 {
    public static void main(String[] args) {
        int n=10;
        int [] tab={5,2,3,4,5,6,3,2,1,1};
        int k=3;
        int sum=0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]==k) sum=sum+1;
        }
        System.out.println("The "+k+" occurs "+sum+" times");
    }

}
