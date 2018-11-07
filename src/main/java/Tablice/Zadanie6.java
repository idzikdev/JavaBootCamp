package Tablice;

import java.util.Scanner;

/**
 * Mamy dany ciąg liczb całkowitych a1,a2,...,an. Zdefiniujmy ciąg sum częściowych bi=ai+a(i+1)+...+an
 * Zadaniem Twojego programu jest wyznaczenie ciągu b dla pewnego ciągu a.
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many numbers?");
        String line1=input.nextLine();
        int n=Integer.parseInt(line1);
        String line2=input.nextLine();
        String [] liczby=line2.split(" ");
        int [] subTotals=new int[n];
        for (int i = 0; i < liczby.length; i++) {
            subTotals[i]=Integer.parseInt(liczby[i]);
            for (int j = i+1; j < liczby.length; j++) {
                subTotals[i]=subTotals[i]+Integer.parseInt(liczby[j]);
            }
        }
        for (int i = 0; i < subTotals.length; i++) {
            System.out.println(subTotals[i]);
        }
    }
}
