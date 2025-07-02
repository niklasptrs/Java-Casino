
import java.util.Scanner;
public class BlackJack
{
   
    public BlackJack()
    {
       
    }

    public void startGame(){
      
        
        

        
    }
    
    public void hitorstand(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wollen Sie eine weitere Karte ziehen oder halten?");
        String abfr = scanner.nextLine();
        char abfrage = abfr.toUpperCase().charAt(0);
        
        if(abfrage == 'H'){
           
        }
        if(abfrage == 'S'){
            
        }
        else if(true){
            System.out.println("Verwende nur H oder S, für Hit oder Stand.");
            hitorstand();
        }
    }
}
