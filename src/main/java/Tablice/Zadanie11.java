package Tablice;

/**
 * https://codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 * 100% rozwiązanie na codility
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie11 {
    public static int[] solution(int[] tab, int k) {
        int[] tab2 = new int [tab.length];
        for (int i = 0; i < tab.length; i++) {
            if (i + k >= tab.length)
                tab2[(i + k) % (tab.length)] = tab[i];
            else
                tab2[i + k] = tab[i];
        }
        return tab2;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] tab = {3, 8, 9, 7, 6};
        int[] result = solution(tab, 3);
        for (int i = 0; i < result.length; i++) {
            if (i==result.length-1) System.out.println(result[i]);
            else System.out.print(result[i]+",");
        }
    }
}
