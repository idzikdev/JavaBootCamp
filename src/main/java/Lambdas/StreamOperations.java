package Lambdas;

import org.omg.CORBA.StringHolder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by operator on 14.08.2017.
 */
public class StreamOperations {
    public static void main(String[] args) {
        String [] tab={"truskawka","agrest","gruszka","jabłko","banan"};
        List<String> list= Arrays.asList(tab);

        //standard foreach
        System.out.println("Standard foreach");
        for (String s:list
             ) {
            System.out.println(s);
        }
        System.out.println("-------------");

        //lambda foreach
        System.out.println("Lambda foreach");
        list.forEach(a-> System.out.println(a));


        System.out.println("-------------");

        //TODO IntStream.rangeClosed(1,100);
        //System.out.println("-------------");

        //wątki stary sposób
        //new Thread(()-> System.out.println("Hello"));
        //System.out.println("-------------");

        //sortowanie alfabetyczne tablicy
        System.out.println("Sortowanie tablicy");
        Arrays.sort(tab,(String s1,String s2)-> (s1.compareTo(s2)));
        System.out.println("-------------");
        System.out.println("Sortowanie z komparatorem");
        Arrays.sort(tab, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println("-------------");
        System.out.println("Strumienie zaczynające się na a");
        //prawdziwne strumienie
        list.stream().filter(s->s.startsWith("a")).forEach(s-> System.out.println(s));
        System.out.println("-------------");
        System.out.println("Strumiene wielkie litery, zaczynające się na t");
        list.stream().filter(s->s.
                startsWith("t")).map(s->s.
                toUpperCase()).
                forEach(s-> System.out.println(s));

        System.out.println("-------------");

    }
}
