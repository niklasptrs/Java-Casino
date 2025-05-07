import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.util.Random;
public class dice {


Scanner scanner = new Scanner(System.in);
int guthaben = 100;
int betnum;
int betwert;
int dice;



public void startGame(){

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
startGame();
}

if(betwert <=guthaben){

int dice = ThreadLocalRandom.current().nextInt(1, 6 + 1);

if(dice == betnum){
System.out.println("Glückwunsch, es war "+ dice +" .");
int gewinn = betwert * 2;

System.out.println("Du erhältst: "+gewinn+" €");

guthaben += gewinn;
}

else if(dice != betnum){
System.out.println("Leider nicht richtig, es war "+dice+" .");
guthaben -= betwert;
}

}
else if(betwert > guthaben || betwert < 1){

System.out.println("Sie haben nicht genug Guthaben, oder einen ungültigen Wert eingegeben.");
startGame();
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

}
}




}