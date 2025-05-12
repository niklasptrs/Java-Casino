import java.util.Random;
import java.util.Scanner;
public class Crash-Game{
int Guthaben = 100;
int Geld
public Crash-Game(){


}

public void startGame(){

System.out.println("Wieviel möchten Sie setzen?");
  Scanner abfr = new Scanner(System.in);
  int Einsatz = abfr.nextInt();

if(Einsatz > Guthaben){

System.out.println("Sie haben einen ungültigen Wert eingegeben, versuchen Sie erneut")
startGame();
}
else if(Einsatz <= Guthaben){
Guthaben -= Einsatz;

System.out.println("Möchten Sie verdoppeln?");
System.out.println("1. Ja");
System.out.println("2: Nein");

Scanner abfr = new Scanner(System.in);
int abfrage = abfr.nextInt();

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

else if(abfrage == 1 && !erfolg){

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

}

private void weiter(){
        System.out.println("Noch einmal spielen?");
        System.out.println("1: Ja");
        System.out.println("2: Nein");

        Scanner abfr = new Scanner(System.in);
        int abfrage = abfr.nextInt();

        if(abfrage >=2){}
        if(abfrage == 1){
            startGame();
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

}

}
