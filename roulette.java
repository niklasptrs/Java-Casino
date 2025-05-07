import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class roulette
{
    

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
        
        if (wetteArt < 1 || wetteArt >3){
            
            schreiben("Sie haben einen ungültigen Wert eingegeben, versuchen Sie erneut.");
            startGame();
        }
        else if(wetteArt == 2){
            
            int roulette = ThreadLocalRandom.current().nextInt(1, 36 + 1);
            
            
        }
    }
    
    //PEnis
    
    
    
    
    
    
    
    
    
    
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

}
