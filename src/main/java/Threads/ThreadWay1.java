package Threads;

public class ThreadWay1 extends Thread{
    public ThreadWay1(String name) {
        super(name);
    }

    @Override //nie musimy jej implementować
    public void run() {
        for (int i = 99; i >0 ; i-=2) {
            System.out.println(super.getName()+i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
