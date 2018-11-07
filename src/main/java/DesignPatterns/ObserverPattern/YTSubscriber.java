package DesignPatterns.ObserverPattern;

public class YTSubscriber implements Observer {

    private int newFilms;
    private String username;

    public YTSubscriber(String username) {
        this.newFilms = 0;
        this.username = username;
    }

    public int getNewFilms() {
        return newFilms;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public void update() {
        newFilms ++;
        System.out.println("Witaj, " + username + ". Kanał na YT wrzucił nowy film. Koniecznie sprawdź.");
    }
}
