package zad3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        int pojemnoscTasmy = 5;
        BlockingQueue<Integer> tasma = new ArrayBlockingQueue<Integer>(pojemnoscTasmy);

        AtomicInteger count = new AtomicInteger(0);
        Cukiernik cukiernik1 = new Cukiernik("Cukiernik1", tasma, count);
        Cukiernik cukiernik2 = new Cukiernik("Cukiernik2", tasma, count);
        Pakowacz pakowacz1 = new Pakowacz("Pakowacz1", tasma);
        Pakowacz pakowacz2 = new Pakowacz("Pakowacz2", tasma);
        Pakowacz pakowacz3 = new Pakowacz("Pakowacz3", tasma);

        cukiernik1.start();
        cukiernik2.start();
        pakowacz1.start();
        pakowacz2.start();
        pakowacz3.start();
    }
}
