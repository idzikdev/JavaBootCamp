package DesignPatterns.ObserverPattern;

public class TestObserver {
    public static void main(String[] args) {
        SomeClient someClient1=new SomeClient("tomasz");
        SomeClient someClient2=new SomeClient("idzik");
        Company company=new Company();
        company.register(someClient1);
        company.register(someClient2);
        company.addSomeNews("Jutro jest nareszcie sobota");
    }
}
