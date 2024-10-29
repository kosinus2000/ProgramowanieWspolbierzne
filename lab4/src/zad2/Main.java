package zad2;

import zad1.Dane;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {


        Semaphore semaphore = new Semaphore(0);
        Dane1 dane1 = new Dane1(semaphore);
        Dane2 dane2 = new Dane2(semaphore);
        Obliczenia obliczenia = new Obliczenia(dane1, dane2,semaphore);

        dane1.start();
        dane2.start();
        obliczenia.start();
    }


}
