import java.util.*;
import java.text.*;

public class Geldleiehen {

    final int STEUERSATZ = 2;
    double kredit;
    int jahre;
    double zinsen;
    double zinsenGesemt;
    String ausgabe;
    String tilgung;
    double prozent;
    int jahre2;
    double abzug;
    double nochZahlen;
    double abgebucht;


    public void eingabe(){

        Scanner sc = new Scanner (System.in);

        System.out.print("Wie hoch soll der Kreidt sein:");
        kredit = sc.nextDouble();

        jahre = 0;
        while (jahre < 1 || jahre > 15){
            System.out.print("Wie lange wolle Sie den Kredit abzahlen (1-15 Jahre):");
            jahre = sc.nextInt();

            if (jahre < 1 || jahre > 15) {
            System.out.println("Fehlermedlung: Der Kreidt kann maximal nur 15 Jahre gehen oder minimal 1 Jahr");
            }
        }

        tilgung = " ";
        System.out.print("Wollen Sie erst nach dem 3.Jahr anfangen zu zahlen:");
        tilgung = sc.next();

    }

    public void verarbeitung(){

        abgebucht = kredit;
        jahre2 = jahre;
        ausgabe = " ";
        int i = 0;

        while (i < jahre){

            i++;

            abzug = kredit/jahre2;
            zinsen = (abgebucht/100)*STEUERSATZ;

            if(tilgung.equals("Ja") && i <=2){
                abzug = 0;
                abgebucht = kredit;
                nochZahlen = kredit;
                jahre2= jahre2-1;
            }

            
            nochZahlen = abgebucht - abzug;
            zinsenGesemt += zinsen;

            ausgabe += (i + "\t" + abgebucht + "\t" + zinsen + "\t" + abzug +  "\t" + nochZahlen + "\n");
            
            abgebucht = abgebucht - abzug;

        }

        prozent = zinsenGesemt/100;

    }


    public void ausgabe (){

        System.out.println("Es sind isgesamt " + zinsenGesemt + " Euro auf den Kredit, dass entschpricht " + prozent + "%");
        System.out.println("Jahre \t Aabgebucht \t Zinsen \t Abzug \t Zahlen");
        System.out.println(ausgabe);
    }

    public static void main (String[]args){

        Geldleiehen Geldleiehen = new Geldleiehen ();

        Scanner sc2 = new Scanner (System.in);

        char loop = 'j';

        while (loop == 'j' || loop == 'J'){

            Geldleiehen.eingabe();
            Geldleiehen.verarbeitung();
            Geldleiehen.ausgabe();
            System.out.print("Wollen Sie neu rechnen(j/n)?");
            loop = sc2.next().charAt(0);
        }

    }



}