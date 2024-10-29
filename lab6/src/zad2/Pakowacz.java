package zad2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Pakowacz extends Thread {
    private final BlockingQueue<Integer> tasma;
    private final BlockingQueue<Integer> tasma2;
    private AtomicInteger idCiasto;
    private AtomicInteger idPudelko;

    Pakowacz(String name, BlockingQueue<Integer> tasma, BlockingQueue<Integer> tasma2, AtomicInteger idCiasto, AtomicInteger idPudelko) {
        super(name);
        this.tasma = tasma;
        this.tasma2 = tasma2;
        this.idCiasto = idCiasto;
        this.idPudelko = idPudelko;

    }

    @Override
    public void run() {
        try {
            while (true) {
                int ciasto1 = tasma.take();
                int ciasto2 = tasma.take();


                System.out.println(Thread.currentThread().getName() + " zdjal ciasto " + ciasto1 +" "+ ciasto2);
                Thread.sleep(5000);
                int pudelko1 = idPudelko.incrementAndGet();
                tasma2.put(pudelko1);

                Thread.sleep(1000);

                System.out.println(Thread.currentThread().getName() + " dal ciasta do pudelka " + pudelko1);

            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
