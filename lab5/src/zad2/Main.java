package zad2;

public class Main {
    public static void main(String[] args) {
        int liczbaFilozofow = 5;
        WidelecMenager widelecMenager = new WidelecMenager(liczbaFilozofow);

        Thread[] filozofowie = new Thread[liczbaFilozofow];
        for (int i = 0; i < liczbaFilozofow; i++) {
            filozofowie[i] = new Thread(new Filozof(i, widelecMenager));
            filozofowie[i].start();
        }
    }
}
