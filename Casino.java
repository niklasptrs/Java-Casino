import java.util.Scanner;
public class Casino{

roulette roulette1;
dice dice1;
slotmaschine slotmaschine1;


public Casino{
boolean valid = false;

while(!valid){
System.out.println("");
System.out.println("Was möchten Sie spielen?");
System.out.println("1: Dice");
System.out.println("2: Roulette");
System.out.println("3: Slotmaschine);
System.out.println("4: Fragen);

Scanner abfr = new Scanner(System.in);
int abfrage = abfr.nextInt();
}
if(abfrage > 4 || abfrage < 1){

System.out.println("Ungültige Eingabe, versuchen Sie erneut.");

}
else if(abfrage == 1){
dice1.startGame();
valid = true;
}
else if(abfrage == 2){
roulette1.startGame();
valid = true;
}
else if(abfrage == 3){
slotmaschine1.startGame();
valid = true;
}


}




}