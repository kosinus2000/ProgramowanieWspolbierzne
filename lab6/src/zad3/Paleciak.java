package zad3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Paleciak extends Thread {

    private final BlockingQueue<Integer> paleta;
    private  AtomicInteger idPudelka;
    private final BlockingQueue<Integer> tasma2;

   public  Paleciak(String name, BlockingQueue<Integer> paleta, BlockingQueue<Integer> tasma2,AtomicInteger idPudelka) {
        super(name);
        this.paleta = paleta;
        this.idPudelka = idPudelka;
        this.tasma2 = tasma2;
    }



    @Override
    public void run() {
        try {
            while (true) {
                int pudelko1 = tasma2.take();
                int pudelko2 = tasma2.take();
                int pudelko3 = tasma2.take();
                int pudelko4 = tasma2.take();
                System.out.println(Thread.currentThread().getName() + " dal pudelko na palete: " + pudelko1 +" "+ pudelko2 +" "+ pudelko3 +" "+ pudelko4);


                Thread.sleep(1000);
                paleta.put(pudelko1);
                paleta.put(pudelko2);
                paleta.put(pudelko3);
                paleta.put(pudelko4);


                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
