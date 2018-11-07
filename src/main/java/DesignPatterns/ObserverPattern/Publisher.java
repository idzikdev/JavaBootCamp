package DesignPatterns.ObserverPattern;

public interface Publisher {

    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();

}
