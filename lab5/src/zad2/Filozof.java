package zad2;

public class Filozof extends Thread{

    private int FilozofID;

    private WidelecMenager widelecMenager;
    public Filozof(int id, WidelecMenager widelecMenager){
        this.FilozofID = id;
        this.widelecMenager = widelecMenager;
    }
    public void run(){
        try{
            for (int i = 0 ; i < 40; i++){
                widelecMenager.wezWidelec(FilozofID);
                System.out.println("Filozof" + FilozofID + " je");
                Thread.sleep(300);
                widelecMenager.odlozWidelec(FilozofID);
                System.out.println("Filozof " + FilozofID + " sie najadl i mysli");
            }
        } catch (InterruptedException e) {
            System.out.println("blad");
        }
    }

}
