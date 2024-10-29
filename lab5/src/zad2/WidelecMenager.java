package zad2;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class WidelecMenager {
    Semaphore[] widelec;
    Semaphore kontrolaWidelcow;
Random random = new Random();
    WidelecMenager(int liczbaFilozofow) {
        widelec = new Semaphore[liczbaFilozofow];
        for (int i = 0; i < liczbaFilozofow; i++) widelec[i] = new Semaphore(1);
        kontrolaWidelcow = new Semaphore(liczbaFilozofow - 1);
    }

   /* public void wezWidelec(int FilozofID) throws InterruptedException {
        //kontrolaWidelcow.acquire();
        widelec[FilozofID].acquire();
        System.out.println("Filozof " + FilozofID + " podniosl widelec nr: " + FilozofID);
        widelec[(FilozofID + 1) % widelec.length].acquire();
        System.out.println("Filozof " + FilozofID + " podniosl widelec nr: " + (FilozofID + 1) % widelec.length);


    }

    public void odlozWidelec(int FilozofID) {
       // kontrolaWidelcow.release();
        widelec[FilozofID].release();
        System.out.println("Filozof " + FilozofID + " odlozyl widelec nr: " + FilozofID);
        widelec[(FilozofID + 1) % widelec.length].release();
        System.out.println("Filozof " + FilozofID + " odlozyl widelec nr: " + (FilozofID + 1) % widelec.length);




    }*/

   public void wezWidelec(int FilozofID,) throws InterruptedException {
       kontrolaWidelcow.acquire();
       widelec[FilozofID].acquire();
       System.out.println("Filozof " + FilozofID + " podniosl widelec nr: " + FilozofID);
       widelec[(random].acquire();
       System.out.println("Filozof " + FilozofID + " podniosl widelec nr: " + (FilozofID + 1) % widelec.length);


   }

    public void odlozWidelec(int FilozofID,) {
        kontrolaWidelcow.release();
        widelec[FilozofID].release();
        System.out.println("Filozof " + FilozofID + " odlozyl widelec nr: " + FilozofID);
        widelec[() % widelec.length].release();
        System.out.println("Filozof " + FilozofID + " odlozyl widelec nr: " + (FilozofID + 1) % widelec.length);
}
