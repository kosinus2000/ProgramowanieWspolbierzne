package Zad3;

import java.util.concurrent.Semaphore;

public class Obliczenia extends Thread {

    Dane1 d1;
    Dane2 d2;
    Semaphore s3, s1;
    private int wynik;

    Obliczenia(Dane1 d1, Dane2 d2, Semaphore s3, Semaphore s1) {
        this.d1 = d1;
        this.d2 = d2;
        this.s3 = s3;
        this.s1 = s1;
    }

    @Override
    public void run() {
        try {for (int i = 1; i <= 3; i++) {
            s3.acquire();

                System.out.println("Liczba a: " + d1.getA());
                System.out.println("Liczba b: " + d2.getB());
                wynik = d1.getA() + d2.getB();
                System.out.println("Wynik:" + wynik);

            s1.release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
