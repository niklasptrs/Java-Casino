import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class slotmaschine{

int speed = 30;
int guthaben = 100;
String  [] Symbole = {

    Symbole[0] = "0"";
Symbole[1] = "&";
Symbole[2] = "€";
Symbole[3] = "§";
Symbole[4] = "$";
Symbole[5] = "#";
Symbole[6] = "7";



}

public  slotmaschine(){

    startGame();
}

public void startGame(){


system.out.println("Wieviel möchten Sie setzen?");
Scanner eins = new Scanner(System.in);
int einsatz = eins.nextInt();


if(einsatz > guthaben){
System.out.println("Ungültige Eingabe, versuchen Sie erneut.");
startGame();


}
else if(einsatz <= guthaben){

int slot1 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
int slot2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
int slot3 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
int slot4 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
int slot5 = ThreadLocalRandom.current().nextInt(1, 6 + 1);

speed = 100;
schreiben(Symbole[slot1]);
speed = 1;
schreiben("=====");
speed = 100;
schreiben(Symbole[slot2]);
speed = 1;
schreiben("=====");
speed = 100;
schreiben(Symbole[slot3]);
speed = 1;
schreiben("=====");
speed = 100;
schreiben(Symbole[slot4]);
speed = 1;
schreiben("=====");
speed = 100;
schreiben(Symbole[slot5]);
speed = 30;


if(slot1 != slot2 && slot2 != slot3 && slot3 != slot4 && slot4 != slot5){

schreiben("-"+einsatz+" €");
guthaben -= einsatz;
schreiben("Noch einmal spielen?");
System.out.println("");
System.out.println("1: Ja");
System.out.println("2: Nein");

Scanner abfr = new Scanner(System.in);
int abfrage = abfr.nextInt();

if(abfrage >=2){}
if(abfrage == 1){
startGame();
}
if (slot1 == slot2 && slot2 == slot3 && slot3 == slot4 && slot4 == slot5) {


    schreiben("Jackpot! +" + einsatz * 15 + " €");


    guthaben += einsatz * 15;


}
if(slot1 == slot2 && slot2 == slot3){


}

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






}