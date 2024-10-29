package zad2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;

public class Obliczenia extends Thread {

    Dane1 d1;
    Dane2 d2;
    Semaphore s;
    private int wynik;

    Obliczenia(Dane1 d1, Dane2 d2, Semaphore s) {
        this.d1 = d1;
        this.d2 = d2;
        this.s = s;
    }

    @Override
    public void run() {
        try {
            s.acquire();
            System.out.println("Liczba a: " + d1.getA());
            System.out.println("Liczba b: " + d2.getB());
            wynik = d1.getA() + d2.getB();
            System.out.println("Wynik:" + wynik);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Liczba a: " + d1.getA());
        System.out.println("Liczba b: " + d2.getB());
        wynik = d1.getA() + d2.getB();
        System.out.println("Wynik:" + wynik);

        s.release();
    }
}
