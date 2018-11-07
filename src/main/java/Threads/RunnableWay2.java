package Threads;

import java.util.Date;

public class RunnableWay2 implements Runnable{
    @Override //musimy zaimplementować
    public void run() {
        while (true){
            System.out.println(new Date());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
