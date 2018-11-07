package Tablice;

import java.util.Scanner;

/**
 * Wprowadź n liczb całkowitych do jednowymiarowej tablicy i wyprowadź je na ekran w
 odwrotnej kolejności.
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie1 {
    public static void main(String[] args) {
        System.out.println("Please enter n number");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] tab=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Please enter element number "+i);
            tab[i]	= scanner.nextInt();
        }
        System.out.println("Printing in reverse order");
        for (int i = tab.length-1;i >=0;i--) {
            System.out.println("Element number "+i+" is "+tab[i]);
        }

    }

}

