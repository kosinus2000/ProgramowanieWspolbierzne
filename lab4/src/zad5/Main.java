package zad5;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {


        Semaphore semaphore = new Semaphore(1);

        Osoba Mama = new Osoba(semaphore);
        Mama.setName("Mama");
        Osoba Tata = new Osoba( semaphore);
        Tata.setName("Tata");
        Osoba Dziecko = new Osoba( semaphore);
        Dziecko.setName("Dziecko");

        Mama.start();
        Tata.start();
        Dziecko.start();
    }
}
