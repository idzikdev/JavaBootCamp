package Interfaces;

/**
 * Created by operator on 01.07.2017.
 */
public class TestAnimal {

    public static void main(String[] args) {
        Voice[] animals = new Voice[5];
        animals[0] = new Cat("mruczek");
        animals[1] = new Dog("Samba");
        animals[2] = new Cat("scala");
        animals[3] = new Cat("kana");
        for ( int i=0;i<=3;i++){
            animals[i].getVoice();
            if ( animals[i] instanceof Dog){
                Dog dog = (Dog)animals[i];
            }
        }

    }

}