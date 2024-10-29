package zad1;

public class Test {
    public static void main(String[] args) {


        Watek watek1 = new Watek();
        watek1.setName("W_1_");
        Watek watek2 = new Watek();
        watek2.setName("W_2_");
        Watek watek3 = new Watek();
        watek3.setName("W_3_");

        watek1.start();
        watek2.start();
        watek3.start();

        System.out.println("Program zostal zakończony!!!!!!!");
    }
}
