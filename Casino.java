import java.util.Scanner;
public class Casino{

    roulette roulette1;
    dice dice1;
    slotmaschine slotmaschine1;

    public Casino(){
        roulette1 = new roulette();
        dice1 = new dice();
        slotmaschine1 = new slotmaschine();
        
        boolean valid = false;
        while(!valid){
            valid = false;
            System.out.println("");
            System.out.println("Was möchten Sie spielen?");
            System.out.println("1: Dice");
            System.out.println("2: Roulette");
            System.out.println("3: Slotmaschine");
            System.out.println("4: Fragen");
            System.out.println("5: Spiel verlassen");

            Scanner abfr = new Scanner(System.in);
            int abfrage = abfr.nextInt();

            if(abfrage > 5 || abfrage < 1){

                System.out.println("Ungültige Eingabe, versuchen Sie erneut.");

            }
            else if(abfrage == 1){
                dice1.startGame();
                valid = false;
            }
            else if(abfrage == 2){
                roulette1.startGame();
                valid = false;
            }
            else if(abfrage == 3){
                slotmaschine1.startGame();
                valid = false;
            }
            else if(abfrage == 4){
                System.out.println("1: Dice - Setze auf eine Augenzahl und lass dich Überraschen ob du richtig liegst. Durch einen Gewinn verdoppelst du deinen Einsatz.");
                System.out.println("2: Roulette - Setze auf eine Zahl von 0 bis 36 oder auf schwarz oder rot, das Rad entscheidet. Bei der richtigen Farbe wird dein Einsatz verdoppelt.");
                System.out.println("Wenn du auf die richtige Zahl gesetzt hast gewinnst du das Sechsunddreißigfache deines Einsatzes.");
                System.out.println("3: Slotmaschine - Ziehe am Hebel und lass die Walzen drehen, bei drei gleichen Symbolen gewinnst du das zehnfache deines Einsatzes.");
                System.out.println("Wenn alle fünf Symbole gleich sind gewinnst du das fünfzehnfache.");
                valid = false;

            }
            else if(abfrage == 5){
                valid = true;
            }
        }
    }


}