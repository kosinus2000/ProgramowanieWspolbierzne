package Zad1;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {


        int liczbaTelefonow = 4;
        int liczbaOsob = 8;

        Semaphore semaphore = new Semaphore(4);

        Osoba Mieszkaniec1 = new Osoba(semaphore);
        Osoba Mieszkaniec2 = new Osoba(semaphore);
        Osoba Mieszkaniec3 = new Osoba(semaphore);
        Osoba Mieszkaniec4 = new Osoba(semaphore);
        Osoba Mieszkaniec5 = new Osoba(semaphore);
        Osoba Mieszkaniec6 = new Osoba(semaphore);
        Osoba Mieszkaniec7 = new Osoba(semaphore);
        Osoba Mieszkaniec8 = new Osoba(semaphore);

        Mieszkaniec1.start();
        Mieszkaniec2.start();
        Mieszkaniec3.start();
        Mieszkaniec4.start();
        Mieszkaniec5.start();
        Mieszkaniec6.start();
        Mieszkaniec7.start();
        Mieszkaniec8.start();
    }
}
