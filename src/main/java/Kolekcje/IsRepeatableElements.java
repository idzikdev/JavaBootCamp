package Kolekcje;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by operator on 01.07.2017.
 */
public class IsRepeatableElements {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();
        lista.add("mysz");
        lista.add("chomik");
        lista.add("świnka morska");
        lista.add("chomik");
        lista.add("chomik");
        if (isRepeatable(lista))
            System.out.println("TAK");
        else
            System.out.println("NIE");
    }

    public static boolean isRepeatable(List<String> spis) {
        int i = 0;
        while (spis.size() > 1) {
            String el = spis.get(i);
            spis.remove(el);
            if (spis.contains(el))
                return true;
        }
        return false;
    }

}
