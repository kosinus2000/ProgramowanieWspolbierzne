package zad3;

public class LicznikWatkow {

    private int wartoscKrytyczna;
    public int policzMnie() {
        wartoscKrytyczna += 1;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        wartoscKrytyczna--;
        return wartoscKrytyczna;
    }
}

