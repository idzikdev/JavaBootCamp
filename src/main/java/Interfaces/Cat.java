package Interfaces;

/**
 * Created by operator on 01.07.2017.
 */
public class Cat implements Voice {
    private String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public void getVoice() {
        System.out.println("miau miau");
    }

}