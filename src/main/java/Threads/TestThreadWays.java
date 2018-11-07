package Threads;

public class TestThreadWays {
    public static void main(String[] args) {
        ThreadWay1 threadWay1=new ThreadWay1("Wątek nr 1 (sposób nr 1)");
        threadWay1.start();

        RunnableWay2 runnableWay2=new RunnableWay2();
        Thread threadway2=new Thread(runnableWay2);
        threadway2.start();

        try {
            threadWay1.join(); // poczekaj aż się wątek skończy i przejdz dalej w programie
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Program wielowątkowy"); // nie ma kontroli kiedy się wykona
    }
}
