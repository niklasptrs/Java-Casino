import io.lyuda.jcards.*;
import java.util.Scanner;
public class BlackJack
{
    Card karten [];
    Deck deck1;
    int summe;
    int aktuelleKarten;
    Card hands [];
    public BlackJack()
    {
        aktuelleKarten = 0;
        deck1 = new Deck();
        deck1.shuffle();
        karten = new Card [52];

        for(int i = 0; i < 52 ;i++){
            karten[i] = deck1.deal();
        }
    }

    public void startGame(){
        
        System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
        System.out.println("Deine Karten sind");
        System.out.println(karten[0]);
        System.out.println(karten[1]);
        System.out.println("»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»»");
        System.out.println("Die Karten des Dealers sind");
        System.out.println(karten[2]);
        //karten[3]
        aktuelleKarten = 4;
        
        

        
    }
    
    public void hitorstand(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wollen Sie eine weitere Karte ziehen oder halten?");
        String abfr = scanner.nextLine();
        char abfrage = abfr.toUpperCase().charAt(0);
        
        if(abfrage == 'H'){
            System.out.println(karten[aktuelleKarten]);
            aktuelleKarten += 1;
        }
        if(abfrage == 'S'){
            
        }
        else if(true){
            System.out.println("Verwende nur H oder S, für Hit oder Stand.");
            hitorstand();
        }
    }
}
