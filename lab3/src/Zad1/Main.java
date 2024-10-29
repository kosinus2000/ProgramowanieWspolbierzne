package Zad1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        long czasStartowy = System.nanoTime();
        final int rozmiarTablicy = 320000000;
        Random random = new Random();
        int[] tablica = new int[rozmiarTablicy];

        for (int i = 0; i < tablica.length; i++)
            tablica[i] = random.nextInt();



        Watek Watek1 = new Watek(tablica, 0, 85000000);
        Watek Watek2 = new Watek(tablica, 85000000 + 1, 170000000);
        Watek Watek3 = new Watek(tablica, 170000000 + 1, 255000000);
        Watek Watek4 = new Watek(tablica, 255000000 + 1, 320000000-1);

        Watek1.start();
        Watek2.start();
        Watek3.start();
        Watek4.start();
        try {
            Watek1.join();
            Watek2.join();
            Watek3.join();
            Watek4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Wartosc minmalna Watek1:" + Watek1.getMin());
        System.out.println("Wartosc maksymalna Watek 1: " + Watek1.getMax());
        System.out.println();

        System.out.println("Wartosc minmalna Watek2:" + Watek2.getMin());
        System.out.println("Wartosc maksymalna Watek 2: " + Watek2.getMax());
        System.out.println();

        System.out.println("Wartosc minmalna Watek3:" + Watek3.getMin());
        System.out.println("Wartosc maksymalna Watek 3: " + Watek3.getMax());
        System.out.println();

        System.out.println("Wartosc minmalna Watek4:" + Watek4.getMin());
        System.out.println("Wartosc maksymalna Watek 4: " + Watek4.getMax());
        System.out.println();
        int[] maxTab = {Watek1.getMax(), Watek2.getMax(), Watek3.getMax(), Watek4.getMax()};

        int[] minTab = {Watek1.getMin(), Watek2.getMin(), Watek3.getMin(), Watek4.getMin()};

        int maxOgolne = maxTab[0];
        for (int num : maxTab) {
            if (num > maxOgolne) {
                maxOgolne = num;
            }
        }

        int minOgolne = minTab[0];
        for (int num : minTab) {
            if (num < minOgolne) {
                minOgolne = num;
            }
        }

        System.out.println("Wartosc minmalna:" + minOgolne);
        System.out.println("Wartosc maksymalna: " + maxOgolne + "\n");


        long czasKoncowy = System.nanoTime();

        long czasWykonania = czasKoncowy - czasStartowy;
        System.out.println("Czas Wykonania: " + czasWykonania / 1000000000.0 + "s");
    }

//Czas wykonania zadania dla jednego i 4 wątków jest niemal ten sam i wynosi troszkę ponad 3 sekundy
}
