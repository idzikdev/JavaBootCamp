package Exceptions;

/**
 * Created by operator on 24.06.2017.
 */
public class Gra{
    public int dodaj(int a,int b) throws MojWyjatek{
        if (a+b>10) throw new MojWyjatek("za dużo");
        return a+b;
    }
    public static void main(String [] args) {
        int a=10;
        int b=12;
        Gra game=new Gra();
        try {
            game.dodaj(a,b);
        } catch (MojWyjatek e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
