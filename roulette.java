import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class roulette
{

    Guthaben guthaben1;
    boolean willSpielen;

    public roulette(Guthaben guthaben1) {
        this.guthaben1 = guthaben1;
    }

    public void startGame(){
        willSpielen = true;
        while (willSpielen) {
            schreiben("Auf was möchten Sie setzen?");
            System.out.println("");
            schreiben("1: Rot");
            System.out.println("");
            schreiben("2: Schwarz");
            System.out.println("");
            schreiben("3: Zahl");
            System.out.println("");

            Scanner wettArt = new Scanner(System.in);
            int wetteArt = wettArt.nextInt();

            schreiben("Wie viel möchten Sie setzen?");
            Scanner eingabeSatz = new Scanner(System.in);
            int einsatz = eingabeSatz.nextInt();

            if(einsatz > guthaben1.getGuthaben()){

                schreiben("Sie haben einen ungültigen Wert eingegeben, versuchen Sie erneut.");
                System.out.println("");
                startGame();
            }

            else if(einsatz <= guthaben1.getGuthaben()){
                if (wetteArt < 1 || wetteArt >3){

                    schreiben("Sie haben einen ungültigen Wert eingegeben, versuchen Sie erneut.");
                    System.out.println("");
                    startGame();
                }

                else if(wetteArt == 1){

                    int roulette = ThreadLocalRandom.current().nextInt(1, 36 + 1);

                    if(istInArray(rot, roulette)){
                        int gewinn = einsatz * 2;
                        guthaben1.setGuthaben(guthaben1.getGuthaben() + gewinn);
                        schreiben("Herzlichen Glückwunsch Sie haben "+gewinn+" € gewonnen!");
                        System.out.println("");
                        schreiben("Möchten Sie noch einmal spielen?");
                        System.out.println("");
                        schreiben("1: Ja");
                        System.out.println("");
                        schreiben("2: Nein");
                        System.out.println("");

                        Scanner abfr = new Scanner(System.in);
                        int abfrage = abfr.nextInt();
                        if(abfrage >= 2){
                            willSpielen = false;
                        }
                        else if(abfrage == 1){
                            startGame();
                        }

                    }

                    else if(!istInArray(rot, roulette)){
                        guthaben1.setGuthaben(guthaben1.getGuthaben() - einsatz);
                        schreiben("Du hast leider nicht gewonnen, es war "+roulette);
                        System.out.println("");
                        schreiben("Möchtest du eine neue Runde starten?");
                        System.out.println("");
                        schreiben("1: Ja");
                        System.out.println("");
                        schreiben("2: Nein");

                        Scanner abfr = new Scanner(System.in);
                        int abfrage = abfr.nextInt();
                        if(abfrage >= 2){
                            willSpielen = false;
                        }
                        else if(abfrage == 1){
                            startGame();
                        }
                    }

                }

                else if(wetteArt == 2){
                    int roulette = ThreadLocalRandom.current().nextInt(1, 36 + 1);
                    if(istInArray(schwarz, roulette)){
                        int gewinn = einsatz * 2;
                        guthaben1.setGuthaben(guthaben1.getGuthaben() + gewinn);
                        schreiben("Herzlichen Glückwunsch Sie haben "+gewinn+" € gewonnen!");
                        System.out.println("");
                        schreiben("Möchten Sie noch einmal spielen?");
                        System.out.println("");
                        schreiben("1: Ja");
                        System.out.println("");
                        schreiben("2: Nein");
                        System.out.println("");

                        Scanner abfr = new Scanner(System.in);
                        int abfrage = abfr.nextInt();
                        if(abfrage >= 2){
                            willSpielen = false;
                        }
                        else if(abfrage == 1){
                            startGame();
                        }

                    }

                    else if(!istInArray(schwarz, roulette)){
                        guthaben1.setGuthaben(guthaben1.getGuthaben() - einsatz);
                        schreiben("Du hast leider nicht gewonnen, es war "+roulette);
                        System.out.println("");
                        schreiben("Möchtest du eine neue Runde starten?");
                        System.out.println("");
                        schreiben("1: Ja");
                        System.out.println("");
                        schreiben("2: Nein");

                        Scanner abfr = new Scanner(System.in);
                        int abfrage = abfr.nextInt();
                        if(abfrage >= 2){
                            willSpielen = false;
                        }
                        else if(abfrage == 1){
                            startGame();
                        }
                    }
                } 
                else if(wetteArt == 3){

                    schreiben("Auf welche Zahl möchtest du setzen, wähle zwischen 0 und 36.");
                    System.out.println("");

                    Scanner abfr1 = new Scanner(System.in);
                    int wette = abfr1.nextInt();

                    if(wette > 36){
                        schreiben("Ungültige Eingabe, versuche erneut.");
                        startGame();
                    }

                    else if(wette >= 0 && wette <= 36){
                        int roulette = ThreadLocalRandom.current().nextInt(1, 36 + 1);

                        if(true){

                            int gewinn = einsatz + einsatz * 35;
                            guthaben1.setGuthaben(guthaben1.getGuthaben() + gewinn);
                            schreiben("Herzlichen Glückwunsch Sie haben "+gewinn+" € gewonnen!");
                            System.out.println("");
                            schreiben("Möchten Sie noch einmal spielen?");
                            System.out.println("");
                            schreiben("1: Ja");
                            System.out.println("");
                            schreiben("2: Nein");
                            System.out.println("");

                            Scanner abfr = new Scanner(System.in);
                            int abfrage = abfr.nextInt();
                            if(abfrage >= 2){
                                willSpielen = false;
                            }
                            else if(abfrage == 1){
                                startGame();
                            }

                        }
                        else if(wette != roulette){
                            guthaben1.setGuthaben(guthaben1.getGuthaben() - einsatz);
                            schreiben("Du hast leider nicht gewonnen, es war "+roulette);
                            System.out.println("");
                            schreiben("Möchtest du eine neue Runde starten?");
                            System.out.println("");
                            schreiben("1: Ja");
                            System.out.println("");
                            schreiben("2: Nein");

                            Scanner abfr = new Scanner(System.in);
                            int abfrage = abfr.nextInt();
                            if(abfrage >= 2){
                                willSpielen = false;
                            }
                            else if(abfrage == 1){
                                startGame();
                            }

                        }
                    }
                }
            }
        }
    }

    public void schreiben(String pText){
        String text = pText;

        for (char buchstabe : text.toCharArray()) {
            System.out.print(buchstabe); // Gibt Buchstaben einzeln aus
            try {
                Thread.sleep(30); // Pause von 100 Millisekunden
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static boolean istInArray(int[] array, int zahl) {
        for (int z : array) {
            if (z == zahl) {
                return true;
            }
        }
        return false;
    }

    int[] schwarz = {
            2, 4, 6, 8, 10,
            11, 13, 15, 17, 20,
            22, 24, 26, 28, 29,
            31, 33, 35
        };

    int[] rot = {
            1, 3, 5, 7, 9,
            12, 14, 16, 18, 19,
            21, 23, 25, 27, 30,
            32, 34, 36
        };
}
