package zad1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Semaphore;

public class Obliczenia extends Thread {

    Semaphore s;
    Dane d;
    int wynik;

    Obliczenia(Semaphore s, Dane d) {
        this.s = s;
        this.d = d;
    }


    public void run() {
    try {
        s.acquire();
    }
    catch (InterruptedException e){
        e.printStackTrace();
    }
        System.out.println("Liczba a: " + d.getA());
        System.out.println("Liczba b: " + d.getB());
        wynik = d.getA() + d.getB();
        System.out.println("Wynik:" + wynik);
    }
}
