package Klasy;

/**
 * Created by operator on 25.02.2017.
 */
public class TestGame {
    public static void main(String[] args) {
        Player[] gracze=new Player[5];
        gracze[0]=new Player("Jasio","Kowalski",90);
        gracze[1]=new Player("Anna","Kowalski",121);
        gracze[2]=new Player("Gosia","Kowalski",99);
        gracze[3]=new Player("Kasia","Kowalski",    101);
        gracze[4]=new Player("Tomasz","Kowalski",200);
        Game gra=new Game("gra",gracze);
        System.out.println(gra.winner());

    }
}
