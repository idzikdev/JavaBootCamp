package Kolekcje;

/**
 * Created by operator on 01.07.2017.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translator {

    public static void main(String[] args) throws FileNotFoundException {
        Map <String,String> engpol=new HashMap <String,String>();
        Map <String,String> poleng=new HashMap <String,String>();
        File plik=new File("dane.txt");
        Scanner odczyt=new Scanner(plik);
        Scanner skan=new Scanner(System.in);
        while(odczyt.hasNextLine()){
            String wiersz=odczyt.nextLine();
            String [] tab=wiersz.split(",");
            engpol.put(tab[0], tab[1]);
            poleng.put(tab[1],tab[0]);
        }
        System.out.println("Podaj słowo angielskie");
        String choice=skan.nextLine();
        if (engpol.containsKey(choice))System.out.println(engpol.get(choice));
    }
}
