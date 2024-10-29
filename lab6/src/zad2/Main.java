package zad2;

import zad3.Paleciak;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        int pojemnoscTasmy = 5;
        AtomicInteger idCiasta = new AtomicInteger(0);
        AtomicInteger idPudelka = new AtomicInteger(0);
        BlockingQueue<Integer> tasma = new ArrayBlockingQueue<Integer>(pojemnoscTasmy);
        BlockingQueue<Integer> tasma2 = new ArrayBlockingQueue<>(2);
        BlockingQueue<Integer> paleta = new ArrayBlockingQueue<>(4);



        Cukiernik cukiernik1 = new Cukiernik("Cukiernik1", tasma, idCiasta);
        Cukiernik cukiernik2 = new Cukiernik("Cukiernik2", tasma, idCiasta);
        Pakowacz pakowacz1 = new Pakowacz("Pakowacz1", tasma, tasma2, idCiasta, idPudelka);
        Pakowacz pakowacz2 = new Pakowacz("Pakowacz2", tasma, tasma2, idCiasta, idPudelka);
        Pakowacz pakowacz3 = new Pakowacz("Pakowacz3",tasma, tasma2, idCiasta, idPudelka);
        Paleciak paleciak1 = new Paleciak("Paleciarz1", paleta, tasma2, idPudelka);
        Paleciak paleciak2 = new Paleciak("Paleciarz2", paleta, tasma2, idPudelka);


        cukiernik1.start();
        cukiernik2.start();
        pakowacz1.start();
        pakowacz2.start();
        pakowacz3.start();
        paleciak1.start();
        paleciak2.start();
    }
}
