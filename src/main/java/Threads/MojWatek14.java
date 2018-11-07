package Threads;

/**
 * Created by operator on 29.06.2017.
 */
public class MojWatek14 {
    public static void main(String[] args) {
        //pierwszy wątek starym sposobem Java 1.0-Java 1.4
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=1000;i++) //parzyste
                    if (i%2==0)System.out.println("    "+i);
                //runnable.wait(1000);
            }
        };
        Thread watekNowy= new Thread(runnable);
        watekNowy.start();
        //drugi wątek starym sposobem Java 1.0-Java 1.4
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1;i<=1000;i++) //nieparzyste
                    if (i%2==1)System.out.println(i);
               // thread.wait(1000);
            }
        });
        thread.start();
        System.out.println("Wystartował");
    }
}
