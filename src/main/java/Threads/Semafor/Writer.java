package Threads.Semafor;

import java.util.Random;

public class Writer implements Runnable{
    private Texts texts;

    public Writer(Texts texts) {
        this.texts = texts;
    }

    @Override
    public void run() {
        final Random rand=new Random();
        int i=1;
        while (true){
            texts.addText("Text "+i);
            i++;
            try {
                Thread.sleep(100*(1+rand.nextInt(2)));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
