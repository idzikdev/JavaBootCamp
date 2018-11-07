package Enumy;

/**
 * Created by operator on 23.06.2017.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GuitarEnumTest {

    public static void main(String[] args) {
        Guitar g1=new Guitar(GuitarEnum.ACOUSTIC,200,"gitara 1","firma 1");
        Guitar g2=new Guitar(GuitarEnum.BASS,200,"gitara 2","firma 1");
        Guitar g3=new Guitar(GuitarEnum.ELECTRIC,200,"gitara 2","firma 3");
        List <Guitar>lista= new ArrayList<Guitar>();
        lista.add(g1);
        lista.add(g2);
        lista.add(g3);
        //System.out.println(lista);
        Collections.sort(lista);
        System.out.println("The guitars we have");
        System.out.println(lista);
        System.out.println("Please enter a diameter");
        Scanner skan=new Scanner(System.in);
        int diameter=skan.nextInt();
        for (Guitar guitar : lista) {
            if (guitar.getDiameter()==diameter)
                System.out.println("We have "+guitar);
        }
    }

}
