package zad1;

public class Watek extends Thread {

    @Override
    public void run() {

        for (int i = 1; i < 11; i++) {
            System.out.println("Nazwa watku: " + Thread.currentThread().getName() + i);

        }
        if(getName() == "W_1_")
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

