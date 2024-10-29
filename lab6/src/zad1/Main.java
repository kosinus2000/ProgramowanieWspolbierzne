package zad1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        int pojemnoscTasmy = 5;
        BlockingQueue<Integer> tasma = new ArrayBlockingQueue<Integer>(pojemnoscTasmy);

        AtomicInteger count = new AtomicInteger(0);
        Cukiernik cukiernik = new Cukiernik("Cukiernik",tasma,count);

        Pakowacz pakowacz = new Pakowacz("Pakowacz",tasma );

        cukiernik.start();
        pakowacz.start();

    }
}
