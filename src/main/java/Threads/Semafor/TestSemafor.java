package Threads.Semafor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSemafor {
    private static void runSemafors(){
        Texts texts=new Texts();
        Writer writer=new Writer(texts);
        Thread threadWriter=new Thread(writer);
        threadWriter.start();
        Reader reader=new Reader(texts);
        Thread threadReader=new Thread(reader);
        threadReader.start();
    }

    private static void runExecutor(){
        Texts texts=new Texts();
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        executorService.execute(new Writer(texts));
        executorService.execute(new Reader(texts));
        //czyszczenie po sobie
        executorService.shutdown();

    }
    public static void main(String[] args) {
        //runSemafors();
        runExecutor();
    }
}
