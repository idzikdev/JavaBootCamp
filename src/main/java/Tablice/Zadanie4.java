package Tablice;

/**
 * Dla danej tablicy liczb całkowitych oblicz średnią arytmetyczną oraz sumę ciągu.
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie4 {
    public static void main(String[] args) {
        int [] tab={3,4,5,2,3,4,7,8,9};
        double average=0;
        int sum=0;
        for (int i = 0; i < tab.length; i++) {
            sum=sum+tab[i];
        }
        average=sum/tab.length;
        System.out.println("Sum "+sum);
        System.out.println("Average "+average);

    }
}
