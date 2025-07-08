import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.util.Random;
public class dice {

    Scanner scanner = new Scanner(System.in);
    Guthaben guthaben1;
    int betnum;
    int betwert;
    int dice;

    public dice(Guthaben guthaben1){
        this.guthaben1 = guthaben1;
    }

    public void startGame(){
        System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
        System.out.println("Auf welche Nummer wollen Sie setzen, wählen Sie zwischen 1-6.");
        Scanner abfr = new Scanner(System.in);
        betnum = abfr.nextInt();

        if (betnum <=6 && betnum >=1){

            System.out.println("Wieviel wollen Sie auf "+betnum+" setzen?");
            Scanner wert = new Scanner(System.in);
            betwert = wert.nextInt();

        }

        else if (betnum <1 || betnum >6){
            System.out.println("Sie haben einen falschen Wert eingegeben, versuchen Sie erneut,");
            System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
            startGame();
        }

        if(betwert <=guthaben1.getGuthaben()){

            int dice = ThreadLocalRandom.current().nextInt(1, 6 + 1);

            if(dice == betnum){
                System.out.println("Glückwunsch, es war "+ dice +" .");
                int gewinn = betwert * 2;

                System.out.println("Du erhältst: "+gewinn+" €");
                System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
                guthaben1.setGuthaben(guthaben1.getGuthaben() + gewinn);
            }

            else if(dice != betnum){
                System.out.println("Leider nicht richtig, es war "+dice+" .");
                System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
                guthaben1.setGuthaben(guthaben1.getGuthaben() - betwert);
            }

        }
        else if(betwert > guthaben1.getGuthaben() || betwert < 1){

            System.out.println("Sie haben nicht genug Guthaben, oder einen ungültigen Wert eingegeben.");
            startGame();
            System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
        }
        System.out.println("Wollen Sie noch einmal spielen?");
        System.out.println("1: Ja");
        System.out.println("2: Nein");

        Scanner ergabfr = new Scanner(System.in);
        int erg = ergabfr.nextInt();

        if(erg == 1){
            startGame();
        }
        else if( erg != 1){
            System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
        }
    }


}