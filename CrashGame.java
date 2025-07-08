import java.util.Random;
import java.util.Scanner;
public class CrashGame{
    Guthaben guthaben1;
    int Guthaben;
    int Geld;
    boolean weiter;
    int Einsatz;
    int Verdopplungen;
    Scanner scanner;

    public CrashGame(){
        guthaben1 = new Guthaben();
        scanner = new Scanner(System.in);
    }

    public void startGame(){
        Guthaben = guthaben1.getGuthaben();
        weiter = true;
        Verdopplungen = 0;
        while (weiter && Verdopplungen < 5 && Guthaben > 0) {
            einsatzAbfr();
        }
        System.out.println("Spiel beendet. Ihr Guthaben: " + Guthaben + " €");
        guthaben1.setGuthaben(Guthaben);
    }

    private void einsatzAbfr() {
        boolean gültigeEingabe = false;
        while (!gültigeEingabe) {
            System.out.println("Wieviel möchten Sie setzen?");
            if (scanner.hasNextInt()) {
                Einsatz = scanner.nextInt();
                if (Einsatz > Guthaben || Einsatz <= 0) {
                    System.out.println("Ungültige Eingabe, versuchen Sie erneut.");
                } else {
                    gültigeEingabe = true;
                }
            } else {
                System.out.println("Bitte geben Sie eine Zahl ein.");
                scanner.next(); // ungültige Eingabe verwerfen
            }
        }
        Guthaben -= Einsatz;
        guthaben1.setGuthaben(Guthaben);
        Geld = Einsatz;
        verdoppeln();
    }

    private void verdoppeln() {
        boolean weiterVerdoppeln = true;
        while (weiterVerdoppeln && Verdopplungen < 5) {
            System.out.println("Möchten Sie verdoppeln?");
            System.out.println("1. Ja");
            System.out.println("2. Nein");
            int abfrage = -1;
            if (scanner.hasNextInt()) {
                abfrage = scanner.nextInt();
            } else {
                System.out.println("Bitte geben Sie eine Zahl ein.");
                scanner.next();
                continue;
            }
            if (abfrage == 1) {
                Random random = new Random();
                boolean erfolg = random.nextBoolean();
                if (erfolg) {
                    Geld *= 2;
                    Verdopplungen++;
                    System.out.println("Glückwunsch! Sie haben verdoppelt. Es sind nun " + Geld + " € im Spiel (Verdopplungen: " + Verdopplungen + ")");
                } else {
                    System.out.println("Leider verloren - " + Geld + " €");
                    Geld = 0;
                    weiterVerdoppeln = false;
                }
            } else if (abfrage == 2) {
                Guthaben += Geld;
                guthaben1.setGuthaben(Guthaben);
                System.out.println("Sie nehmen " + Geld + " € mit. Ihr Guthaben: " + Guthaben + " €");
                weiterVerdoppeln = false;
            } else {
                System.out.println("Ungültige Eingabe, bitte 1 oder 2 wählen.");
            }
        }
        if (Verdopplungen >= 5) {
            Guthaben += Geld;
            guthaben1.setGuthaben(Guthaben);
            System.out.println("Maximale Verdopplungen erreicht! Sie nehmen " + Geld + " € mit. Ihr Guthaben: " + Guthaben + " €");
        }
        nochmalSpielenFragen();
    }

    private void nochmalSpielenFragen() {
        System.out.println("Noch einmal spielen?");
        System.out.println("1: Ja");
        System.out.println("2: Nein");
        int abfrage = -1;
        boolean gültigeEingabe = false;
        while (!gültigeEingabe) {
            if (scanner.hasNextInt()) {
                abfrage = scanner.nextInt();
                if (abfrage == 1) {
                    weiter = true;
                    gültigeEingabe = true;
                } else if (abfrage == 2) {
                    weiter = false;
                    gültigeEingabe = true;
                } else {
                    System.out.println("Bitte 1 oder 2 eingeben.");
                }
            } else {
                System.out.println("Bitte geben Sie eine Zahl ein.");
                scanner.next();
            }
        }
    }
}

