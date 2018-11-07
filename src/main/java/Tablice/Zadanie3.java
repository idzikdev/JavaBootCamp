package Tablice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 * W tablicy jednowymiarowej znajdź liczbę, która występuje najczęściej.
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie3 {
    public static void main(String[] args) {
        int [] tab={2,3,4,1,3,4,6,1,4,5,6};
        Arrays.sort(tab);
        HashMap <Integer,Integer> hashMap=new HashMap();
        for (int i:tab
             ) {
            if (hashMap.containsKey(i)) hashMap.replace(i,hashMap.get(i)+1);
            else hashMap.put(i,1);

        }
        int max=1;
        int maxElement=hashMap.get(tab[0]);
        for (Integer klucz : hashMap.keySet()) {
            Integer value = hashMap.get(klucz);
            if (value > max){
                max = value;
                maxElement=klucz;
            }

        }
        System.out.println("Most common element "+maxElement);
        System.out.println("Occurs "+max+" times");
    }
}

