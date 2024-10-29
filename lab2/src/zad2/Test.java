package zad2;

public class Test {
    public static void main(String[] args) {

        Watek w1 = new Watek();
        Watek w2 = new Watek();
        Watek w3 = new Watek();

        Thread t1 = new Thread(w1);
        Thread t2 = new Thread(w2);
        Thread t3 = new Thread(w3);

        t1.setName("Watek nr 1   _");
        t2.setName("Watek nr 2   _");
        t3.setName("Watek nr 3   _");

        t1.start();
        t2.start();
        t3.start();
    }
}
