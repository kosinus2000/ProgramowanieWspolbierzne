package Zad1;

import java.util.concurrent.Semaphore;

public class Osoba extends Thread {
    Semaphore s;

    Osoba(Semaphore s) {

        this.s = s;
    }


    void CzytaKsiazke() {
        System.out.printf("Osoba: %s czyta ksiazke%n", Thread.currentThread().getName());
    }

    void PijeHerbate() {
        System.out.printf("Osoba: %s pije herbate%n", Thread.currentThread().getName());
    }

    void RozmawiaPrzezTelefon() {
        System.out.printf("Osoba: %s rozmawia przez telefon%n", Thread.currentThread().getName());
    }

    void PracaPrzyKomputerze() {
        System.out.printf("Osoba: %s pracuje przy komputerze%n", Thread.currentThread().getName());
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {


                CzytaKsiazke();
                Thread.sleep(300);
                PijeHerbate();
                Thread.sleep(300);

                s.acquire();
                System.out.printf("Osoba: %s bierze telefon%n", Thread.currentThread().getName());
                RozmawiaPrzezTelefon();
                System.out.printf("Osoba: %s podklada telefon%n", Thread.currentThread().getName());
                s.release();


                PracaPrzyKomputerze();
                Thread.sleep(300);

            }

        } catch (InterruptedException e) {
            e.getStackTrace();
        }


    }
}
