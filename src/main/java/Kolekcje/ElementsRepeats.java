package Kolekcje;

import java.util.*;

/**
 * Created by operator on 01.07.2017.
 */
public class ElementsRepeats {

    public static void main(String[] args) {
        List<String> lista=new ArrayList<String>();
        lista.add("mysz");
        lista.add("chomik");
        lista.add("świnka morska");
        lista.add("chomik");
        lista.add("chomik");
        System.out.println(countElements(lista));
        Map<String,Integer> mapka=new HashMap<String,Integer>(countElements(lista));
        for (String key : mapka.keySet()) {
            Integer value = mapka.get(key);
            System.out.println("Klucz " + key + ", wartość " + value);
        }
    }

    public static Map<String,Integer> countElements(List<String> spis){
        Map<String,Integer>mapa=new HashMap<String,Integer>();
        Iterator<String> it=spis.iterator();
        while(it.hasNext()){
            String el=it.next();
            if (mapa.containsKey(el)) mapa.replace(el, mapa.get(el)+1);
            else mapa.put(el, 1);
        }
        return mapa;
    }

}
