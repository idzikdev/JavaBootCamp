package Threads.Semafor;

import java.util.concurrent.Semaphore;

public class Texts {
    private Semaphore semaphoreReader;
    private Semaphore semaphoreWriter;
    private String text;

    public Texts() {
        semaphoreReader = new Semaphore(0);
        semaphoreWriter = new Semaphore(1);
    }
    //metoda wywoływana przez pisarza
    public void addText(String newText){
        //unikamy sytuacji aby pisarz nie pisał dwa razy
        try {
            semaphoreWriter.acquire(); // opuszczenie szlabanu w dół
            System.out.println("Pisarz napisał text: "+newText+" do magazynu tekstu");
            text=newText;
            semaphoreReader.release(); //podniesienie szlabanu
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //metoda wywoływana przez czytelnika
    public String getText(){
        try {
            String result;
            semaphoreReader.acquire();
            result=text;
            System.out.println("Czytelnik przeczytał tekst :"+result);
            text=null;
            semaphoreWriter.release();
            return result;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      return null;
    }
}
