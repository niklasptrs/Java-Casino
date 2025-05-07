import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class roulette
{
    
    int guthaben = 100;

    public roulette()
    {
        startGame();
    }

    public void startGame(){

        schreiben("Auf was möchten Sie setzen?");
        schreiben("1: Rot");
        schreiben("2: Schwarz");
        schreiben("3:Zahl");
        
        Scanner wettArt = new Scanner(System.in);
        int wetteArt = wettArt.nextInt();
        
schreiben("Wie viel möchten Sie setzen?");
Scanner eingabeSatz = new Scanner(System.in);
int einsatz = eingabeSatz.nextInt();

if(einsatz > guthaben){

    schreiben("Sie haben einen ungültigen Wert eingegeben, versuchen Sie erneut.");
            startGame();
}

else if(einsatz <= guthaben){
        if (wetteArt < 1 || wetteArt >3){
            
            schreiben("Sie haben einen ungültigen Wert eingegeben, versuchen Sie erneut.");
            startGame();
        }
        
        else if(wetteArt == 1){

            int roulette = ThreadLocalRandom.current().nextInt(1, 36 + 1);
            
            if(Arrays.stream(rot).anyMatch(s->s.eaquals(roulette))){
int gewinn = einsatz * 2;
schreiben("Herzlichen Glückwunsch Sie haben "+gewinn+" € gewonnen!")
schreiben("Möchten Sie noch einmal spielen?");
schreiben("1: Ja");
schreiben("2: Nein");

Scanner abfr = new Scanner(System.in);
        int abfrage = abfr.nextInt();
if(abfrage >= 2){

}
else if(abfrage == 1){
    startGame();
}

            }
           
        }
        
        
        
        else if(wetteArt == 2){
            
            int roulette = ThreadLocalRandom.current().nextInt(1, 36 + 1);
            
            if(Arrays.stream(schwarz).anyMatch(s->s.eaquals(roulette))){
int gewinn = einsatz * 2;
schreiben("Herzlichen Glückwunsch Sie haben "+gewinn+" € gewonnen!")
schreiben("Möchten Sie noch einmal spielen?");
schreiben("1: Ja");
schreiben("2: Nein");

Scanner abfr = new Scanner(System.in);
        int abfrage = abfr.nextInt();
if(abfrage >= 2){

}
else if(abfrage == 1){
    startGame();
}

            }
           }   }
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
