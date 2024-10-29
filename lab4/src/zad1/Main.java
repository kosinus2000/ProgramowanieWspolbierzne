package zad1;


import java.util.concurrent.Semaphore;

public class Main{
    public static void main(String[] args) {


        Semaphore semaphore = new Semaphore(0);

        Dane dane = new Dane(semaphore);
        Obliczenia obliczenia = new Obliczenia(semaphore, dane);

        dane.start();
        obliczenia.start();
    }
}
