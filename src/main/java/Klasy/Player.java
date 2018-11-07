package Klasy;

/**
 * Created by operator on 25.02.2017.
 */
public class Player {
    private String name;
    private String username;
    private int points;
    public Player(String name, String username, int points) {
        super();
        this.name = name;
        this.username = username;
        this.points = points;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public String fullName(){
        return name+" "+username;
    }
}
