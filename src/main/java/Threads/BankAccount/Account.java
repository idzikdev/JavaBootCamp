package Threads.BankAccount;

import java.util.Random;

public class Account {
    private int value;
    private final static Random rand=new Random();
    public Account(){
        value=0;
    }

    synchronized public void increase(){
        int temp=value;
        temp++;
        //symulujemy długie działanie
        try {
            Thread.sleep(100*(1+rand.nextInt(2)));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        value=temp;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value=value;
    }
}
