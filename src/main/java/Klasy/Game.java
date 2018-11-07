package Klasy;

/**
 * Created by operator on 25.02.2017.
 */
public class Game {
    private String name;
    private Player[] players;
    public Game(String name, Player[] players) {
        super();
        this.name = name;
        this.players = players;
    }
    public String winner(){
        int indeks=0;
        int maxPoints=0;
        for (int i=0;i<players.length;i++){
            if (players[i].getPoints()>maxPoints) {
                indeks=i;
                maxPoints=players[i].getPoints();
            }
            i++;
        }
        if (maxPoints>100)
        return players[indeks].fullName();
        return "There is no winner";
    }

    public static void main(String[] args) {

    }
}
