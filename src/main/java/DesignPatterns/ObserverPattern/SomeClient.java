package DesignPatterns.ObserverPattern;

public class SomeClient implements Observer {

    private String name;


    public SomeClient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void update() {
        System.out.println("Hej " + name + "! Firma wrzuciła jakieś nowe newsy!");
    }
}
