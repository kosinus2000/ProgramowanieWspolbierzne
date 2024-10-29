package zad3;

import java.util.concurrent.BlockingQueue;

public class Pakowacz extends Thread {
    private final BlockingQueue<Integer> queue;

    Pakowacz(String name, BlockingQueue<Integer> queue) {
        super(name);
        this.queue = queue;

    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Integer x = queue.take();
                System.out.println(Thread.currentThread().getName() + " zdjal ciasto " + x);

                Thread.sleep(8000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
