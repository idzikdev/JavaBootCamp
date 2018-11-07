package Exceptions;

/**
 * Created by operator on 24.06.2017.
 */
public class MojWyjatek extends Exception {
    public MojWyjatek(){
        super();
    }
    public MojWyjatek(String przyczyna){
        super();
        System.out.println("Wystapił wyjątek a przyczyna to "+przyczyna);
    }
}
