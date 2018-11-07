package DesignPatterns.ObserverPattern;

public class YTTest {
    public static void main(String[] args) {
        YTSubscriber subscriber1 = new YTSubscriber("Oskar");
        YTSubscriber subscriber2 = new YTSubscriber("Wojtek");
        YTSubscriber subscriber3 = new YTSubscriber("Krystian");

        YTCanal ytCanal = new YTCanal();

        ytCanal.register(subscriber1);
        ytCanal.publishFilm();
        ytCanal.register(subscriber2);
        ytCanal.register(subscriber3);
        ytCanal.publishFilm();

        System.out.println("Ilość filmów do obejrzenia: " + subscriber1.getNewFilms());
        System.out.println("Ilość filmów do obejrzenia: " + subscriber2.getNewFilms());
        System.out.println("Ilość filmów do obejrzenia: " + subscriber3.getNewFilms());
    }
}
