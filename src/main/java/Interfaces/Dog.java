package Interfaces;

/**
 * Created by operator on 01.07.2017.
 */
public class Dog implements Voice  {
    private String name;

    public Dog(String name){
        this.name = name;
    }

    @Override
    public void getVoice() {
        System.out.println("hau hau");
    }

}
