import java.util.*;
import java.text.*;

public class Auktion{

    int[] gebote = new int[3];
    String objekt;
    String[] interessent = new String[3];

    int bieter;

    int maxGebot;
    int minGebot;
    String maxBieter;
    String minBieter;

    static Scanner sc = new Scanner(System.in);
    DecimalFormat f1 = new DecimalFormat("#,###");

    public void eingabe(){

        char hinzufügen = 'n';

        System.out.print("Was für ein Objekt soll versteigert werden: ");
        objekt = sc.next();

        for (int i = 0; i < gebote.length; i++){

            System.out.print("\nName des " + (i+1) + ". Interessenten: ");
            interessent[i] = sc.next();
            System.out.print("Wie viel EUR bietet "+  interessent[i] + " für das/der " + objekt + ": ");
            gebote[i] = sc.nextInt();
            bieter++;

            if (i < 2){
                System.out.print("Möchten Sie noch einen weitern Interessenten eingeben (J/N): ");
                hinzufügen = sc.next().charAt(0);
            }else {
                System.out.println("\nHinweis: Es können keine Gebote mehr angenommen werden.");
            }

            if (hinzufügen == 'n' || hinzufügen == 'N' ){
                break;
            }
        }
    }

    public void sortierung(){

        maxGebot = gebote[0];
        maxBieter = interessent[0];

        minGebot = gebote[0];
        minBieter = interessent[0];

        for (int i = 1; i < bieter; i++){
            if(gebote[i] > maxGebot){
                maxGebot = gebote[i];
                maxBieter = interessent[i];
            }
            if (gebote[i] < minGebot){
                minGebot = gebote[i];
                minBieter = interessent[i];
            }
        }
    }

    public void ausgabe(){

        System.out.println("\n\nFolgende Gebote wurden getätigt:");

        for (int i = 0; i < bieter; i++){

            System.out.println((i+1) + ".  Gebot:  " + interessent[i] +", "+ f1.format(gebote[i]));

        }

        System.out.println("\n" + maxBieter + " hat mit " + f1.format(maxGebot) + " das höchste Gebot getätigt." );
        System.out.println( minBieter + " hat mit " + f1.format(minGebot) + " das niedrigste Gebot getätigt." );

        System.out.println("\nHerzlichen Glückwunsch " +  maxBieter + " zum Kauf des/der " + objekt);
    }


    public static void main (String[]args){

        Auktion Auktion = new Auktion();

        Auktion.eingabe();
        Auktion.sortierung();
        Auktion.ausgabe();
    }

}