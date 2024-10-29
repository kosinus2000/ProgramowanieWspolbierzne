package Zad3;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {


        Semaphore s1 = new Semaphore(1);
        Semaphore s2 = new Semaphore(0);
        Semaphore s3 = new Semaphore(0);
        Dane1 dane1 = new Dane1(s1,s2);
        Dane2 dane2 = new Dane2(s2,s3);
        Obliczenia obliczenia = new Obliczenia(dane1, dane2,s3,s1);

        dane1.start();
        dane2.start();
        obliczenia.start();
    }


}
