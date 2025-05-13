import java.util.Random;
import java.util.Scanner;
public class CrashGame{
    int Guthaben = 100;
    int Geld;
    boolean weiter;
    int Einsatz;
    public CrashGame(){

    }

    public void startGame(){
        System.out.println("Wieviel möchten Sie setzen?");
        Scanner abfr = new Scanner(System.in);
        int Einsatz = abfr.nextInt();

        if(Einsatz > Guthaben){

            System.out.println("Sie haben einen ungültigen Wert eingegeben, versuchen Sie erneut");
            startGame();
        }
        else if(Einsatz <= Guthaben){
            Guthaben -= Einsatz;

            System.out.println("Möchten Sie verdoppeln?");
            System.out.println("1. Ja");
            System.out.println("2: Nein");

            Scanner abfra = new Scanner(System.in);
            int abfrage = abfra.nextInt();

            Random random = new Random();
            boolean erfolg = random.nextBoolean();

            if(abfrage == 1 && erfolg){
                Geld = 2*Einsatz;
                System.out.println("Glückwunsch Sie haben Ihren Einsatz verdoppelt! Es sind nun "+Geld+" € im Spiel");

                verdoppeln();

                if(abfrage == 1 && erfolg){
                    Geld = 2*Einsatz;
                    System.out.println("Glückwunsch Sie haben Ihren Einsatz verdoppelt! Es sind nun "+Geld+" € im Spiel");
                    verdoppeln();

                    if(abfrage == 1 && !erfolg){

                        System.out.println("Leider verloren - "+Geld+" €");
                        weiter();

                    }
                    else if(abfrage >= 2){
                        Guthaben += Geld;
                        weiter();
                    }

                }
                else if(abfrage == 1 && !erfolg){

                    System.out.println("Leider verloren - "+Einsatz+" €");
                    weiter();

                }
                else if(abfrage >= 2){
                    Guthaben += Einsatz;
                    weiter();
                }

            }
        }}

    private void weiter(){
        System.out.println("Noch einmal spielen?");
        System.out.println("1: Ja");
        System.out.println("2: Nein");

        Scanner abfr = new Scanner(System.in);
        int abfrage = abfr.nextInt();

        if(abfrage >= 2){
            Verdopplungen = 10;
            weiter = false;
        }
        if(abfrage == 1){
            startGameNeu();

        }
    }

    private void verdoppeln(){
        System.out.println("Möchten Sie verdoppeln?");
        System.out.println("1. Ja");
        System.out.println("2: Nein");

        Scanner abfr = new Scanner(System.in);
        int abfrage = abfr.nextInt();

        Random random = new Random();
        boolean erfolg = random.nextBoolean();

        Geld = Einsatz;

        if(abfrage == 1 && erfolg){
            Geld = 2* Einsatz;
            System.out.println("Glückwunsch Sie haben Ihren Einsatz verdoppelt! Es sind nun "+Geld+" € im Spiel");
            Verdopplungen += 1;
            verdoppeln();

        }

        else if(abfrage == 1 && !erfolg){

            System.out.println("Leider verloren - "+Geld+" €");
            Verdopplungen = 0;
            weiter();

        }
        else if(abfrage >= 2){
            Guthaben += Geld;
            Verdopplungen = 0;
            weiter = false;
            weiter();
        }

    }

    int Verdopplungen;
    public void startGameNeu(){
        weiter = true;
        Verdopplungen = 0;
        while(Verdopplungen <= 5 && weiter){

            einsatzAbfr();

        }}

    private void einsatzAbfr() {

        boolean gültigeEingabe = false;
        while (!gültigeEingabe) {
            System.out.println("Wieviel möchten Sie setzen?");
            Scanner abfr = new Scanner(System.in);
            Einsatz = abfr.nextInt();
            try {
                if (Einsatz > Guthaben) {
                    System.out.println("Ungültige Eingabe, versuchen Sie erneut.");
                } else {
                    gültigeEingabe = true;
                    Guthaben -= Einsatz;
                    System.out.println("Einsatz: " + Einsatz + " €");
                    verdoppeln();
                }
            } 
            catch (Exception e) {
                System.out.println("Bitte geben Sie eine Zahl ein.");
                abfr.next(); // Scanner-Fehler zurücksetzen
            }
        }

        Guthaben -= Einsatz;
        System.out.println("Einsatz: " + Einsatz + " €");
        verdoppeln();
    }
}

