package Threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by operator on 30.06.2017.
 * Stwórz program, który będzie równolegle kolejno co 5 i 3 sekundy wysyłał losowe wiadomości z przygotowanej wcześniej listy wiadomości.
 *
 * Np. Wesołych świąt.
 * Jak się czujesz?
 * Mamy dziś piękny dzień
 * Okropnie brzydka pogoda..
 * Podpowiedź : Wykorzystaj 2 wątki
 * Wzorzec: Użyj sterownika z pakietu java util concurrent
 *
 */
public class Zadanie {
    ExecutorService executorService;
    List<String> arrayList= Arrays.asList("Komunikat 1","Komunikat 2","Komunikat 3","Komunikat 4");
    Random random1=new Random();
    Random random2=new Random();
    int losuj1;
    int losuj2;
    public Zadanie() {
        executorService= Executors.newFixedThreadPool(2);
        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                while (true){
            losuj1=random1.nextInt(arrayList.size());
            System.out.println("Wątek nr 1 : "+arrayList.get(losuj1));
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }}
        };
        Runnable runnable2=new Runnable() {
            @Override
            public void run() {
                while(true){
            losuj2=random2.nextInt(arrayList.size());
            System.out.println("Wątek nr 2 : "+arrayList.get(losuj2));
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }}
        };
        executorService.execute(runnable1);
        executorService.execute(runnable2);
        executorService.shutdown();
    }

    public static void main(String[] args) {
        Zadanie zadanie=new Zadanie();
        //System.out.println(zadanie.arrayList.size());
    }
}
