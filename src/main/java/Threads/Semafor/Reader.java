package Threads.Semafor;

import java.util.Random;

public class Reader implements Runnable{
    private Texts texts;

    public Reader(Texts texts) {
        this.texts = texts;
    }

    @Override
    public void run() {
        final Random rand=new Random();

        while (true){
            String txt=texts.getText();
            try {
                Thread.sleep(100*(1+rand.nextInt(2)));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}