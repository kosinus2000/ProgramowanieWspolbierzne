package Zad1;

import java.util.Arrays;

public class Watek extends Thread {
    private int[] tablica;
    private int zakresPoczatek;
    private int zakresKoniec;
    private int min;
    private int max;

    public Watek(int[] tab, int zP, int zK) {
        this.tablica = tab;
        this.zakresPoczatek = zP;
        this.zakresKoniec = zK;
    }

    public int[] getTablica() {
        return tablica;
    }

    public void setTablica(int[] tablica) {
        this.tablica = tablica;
    }

    public int getZakresPoczatek() {
        return zakresPoczatek;
    }

    public void setZakresPoczatek(int zakresPoczatek) {
        this.zakresPoczatek = zakresPoczatek;
    }

    public int getZakresKoniec() {
        return zakresKoniec;
    }

    public void setZakresKoniec(int zakresKoniec) {
        this.zakresKoniec = zakresKoniec;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public void run() {
        int localMin = Integer.MAX_VALUE;
        int localMax = Integer.MIN_VALUE;
        for (int i = zakresPoczatek; i <= zakresKoniec; i++) {
            if (tablica[i] < localMin) {
                localMin = tablica[i];
            }
            if (tablica[i] > localMax) {
                localMax = tablica[i];
            }
        }
        this.min = localMin;
        this.max = localMax;
    }

}
