import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class slotmaschine{

    int speed = 30;
    Guthaben guthaben1;

    String[] Symbole = {"0", "&", "€", "§", "$", "#", "7"};

    public slotmaschine(Guthaben guthaben1) {
        this.guthaben1 = guthaben1;
    }

    public void startGame(){
        System.out.println("Wieviel möchten Sie setzen?");
        Scanner eins = new Scanner(System.in);
        int einsatz = eins.nextInt();

        if(einsatz > guthaben1.getGuthaben()){
            System.out.println("Ungültige Eingabe, versuchen Sie erneut.");
            startGame();

        }
        else if(einsatz <= guthaben1.getGuthaben()){

            int slot1 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
            int slot2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
            int slot3 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
            int slot4 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
            int slot5 = ThreadLocalRandom.current().nextInt(1, 6 + 1);

            speed = 1000;
            schreiben(Symbole[slot1]);
            speed = 1;
            schreiben("=====");
            speed = 1000;
            schreiben(Symbole[slot2]);
            speed = 1;
            schreiben("=====");
            speed = 1000;
            schreiben(Symbole[slot3]);
            speed = 1;
            schreiben("=====");
            speed = 1000;
            schreiben(Symbole[slot4]);
            speed = 1;
            schreiben("=====");
            speed = 1000;
            schreiben(Symbole[slot5]);
            speed = 1;

            if(slot1 != slot2 && slot2 != slot3 && slot3 != slot4 && slot4 != slot5){
                System.out.println("");
                schreiben("-"+einsatz+" €");
                System.out.println("");
                guthaben1.setGuthaben(guthaben1.getGuthaben() - einsatz);
                weiter();
            }

            if (slot1 == slot2 && slot2 == slot3 && slot3 == slot4 && slot4 == slot5) {
                System.out.println("");
                schreiben("Jackpot! +" + einsatz * 15 + " €");
                guthaben1.setGuthaben(guthaben1.getGuthaben() + einsatz * 15);
                weiter();
            }
            //Wenn 345 richtig ist
            if(slot3 == slot4 && slot4 == slot5){
                System.out.println("");
                schreiben("WIN!!!");
                System.out.println("");
                schreiben("+ "+einsatz * 10+" €");
                guthaben1.setGuthaben(guthaben1.getGuthaben() + einsatz * 10);
                weiter();
            }

            //Wenn die 234 richtig ist
            if(slot2 == slot3 && slot3 == slot4){
                System.out.println("");
                schreiben("WIN!!!");
                System.out.println("");
                schreiben("+ "+einsatz * 10+" €");
                guthaben1.setGuthaben(guthaben1.getGuthaben() + einsatz * 10);
                weiter();
            }

            // Wenn die ersten drei richtig sind
            if(slot1 == slot2 && slot2 == slot3){
                System.out.println("");
                schreiben("WIN!!!");
                System.out.println("");
                schreiben("+ "+einsatz * 10+" €");
                guthaben1.setGuthaben(guthaben1.getGuthaben() + einsatz * 10);
                weiter();
            }
            


        }

    }

    public void schreiben(String pText){
        String text = pText;

        for (char buchstabe : text.toCharArray()) {
            System.out.print(buchstabe); // Gibt Buchstaben einzeln aus
            try {
                Thread.sleep(speed); // Pause von 100 Millisekunden
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public void weiter(){
        schreiben("Noch einmal spielen?");
        System.out.println("");
        System.out.println("1: Ja");
        System.out.println("2: Nein");

        Scanner abfr = new Scanner(System.in);
        int abfrage = abfr.nextInt();

        if(abfrage >=2){
            System.out.println("");
        }
        if(abfrage == 1){
            startGame();
        }
    }

}