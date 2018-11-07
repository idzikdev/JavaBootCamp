package Tablice;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Niech dany będzie n-elementowy ciąg liczb całkowitych an.
 * Zadaniem Twojego programu będzie sprawdzenie czy w ciągu jakakolwiek liczba występuje co najmniej trzykrotnie.
 *
 * Created by operator on 25.02.2017.
 */
public class Zadanie7 {
    public static void main(String[] args) {
        int [] tab={2,3,4,1,3,4,6,1,4,5,6};
        Arrays.sort(tab);
        HashMap<Integer,Integer> hashMap=new HashMap();
        for (int i:tab
                ) {
            if (hashMap.containsKey(i)) hashMap.replace(i,hashMap.get(i)+1);
            else hashMap.put(i,1);

        }
        int max=2;
        boolean threeTimes=false;
        for (Integer klucz : hashMap.keySet()) {
            Integer value = hashMap.get(klucz);
            if (value > max){
               threeTimes=true;
               break;
            }
        }
        if (threeTimes) System.out.println("YES");
        else System.out.println("NO");
    }
}
