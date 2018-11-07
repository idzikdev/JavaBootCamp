package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by operator on 29.06.2017.
 */
public class ThreadExecutor {
    private static int wiek=0;
    ExecutorService executorService;
    public ThreadExecutor(){
        executorService= Executors.newFixedThreadPool(2);
        Runnable runnable1=new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
                for (int i=1;i<=100;i++) {
                  //  if (Thread.currentThread().isInterrupted()) return;
                    System.out.println("Wątek nr 1 : " + i);
                  //  Thread.yield();
                }
            }
        };

        Runnable runnable2=new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
                for (int i=1;i<=100;i++){
                  //  if (Thread.currentThread().isInterrupted()) return ;
                System.out.println("Wątek nr 2 : "+i);}
                //Thread.yield();
            }
        };

        Runnable runnable3=new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=1e5;i++) {
                  //  if (Thread.currentThread().isInterrupted()) return;
                    System.out.println("Wątek nr 3 : " + i);
                }
            }
        };

        Runnable runnable4=new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=1e5;i++) {
                  //  if (Thread.currentThread().isInterrupted()) return;
                    System.out.println("Wątek nr 4 : " + i);
                }
            }
        };

        /*try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */
        executorService.execute(runnable1);
        executorService.execute(runnable2);
        //executorService.execute(runnable3);
        //executorService.execute(runnable4);
        //executorService.shutdown(); // zamyka service i nie pozwala zefiniowanych po nim wątkom na działanie
        //executorService.shutdownNow(); // zamyka service i zatrzymuje wszsytkie oczekujące watki w kolejce

    }
    public static void main(String[] args) {
        ThreadExecutor threadExecutor=new ThreadExecutor();
    }
}
