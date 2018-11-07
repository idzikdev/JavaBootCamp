package DesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class YTCanal implements Publisher {

    private List<Observer> observers;

    public YTCanal() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update();
        }
    }

    public void publishFilm(){
        System.out.println("Dodałeś nowy film!");
        notifyObservers();
    }
}
