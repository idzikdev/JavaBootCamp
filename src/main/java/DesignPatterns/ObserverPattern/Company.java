package DesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Company implements Publisher {

    private List<Observer> observers;

    public Company(){
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
        for(Observer  o : observers){
            o.update();
        }
    }

    public void addSomeNews(String info){
        System.out.println("Z ostatniej chwili : "+info);
        notifyObservers();
    }
}
