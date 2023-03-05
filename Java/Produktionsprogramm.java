import java.text.*;
import java.util.*;

public class Produktionsprogramm {

    double verkaufspreis;
    int anzahl;
    double fixkosten;
    double kosten,ertrag,gewinn;
    String programm;
    String ausgabe,stern;
    double varKosten;

    DecimalFormat f1 = new DecimalFormat("#,###.## EUR");

    public void eingabe (){

        Scanner sc = new Scanner(System.in);

        System.out.print("\nBitte geben Sie den Verkaufspreis an:");
        verkaufspreis = sc.nextDouble();

        System.out.print("Weleches Produktionsprogramm wollen Sie wählen:\n");
        System.out.println("Engel:     für Fixkosten = 22.000 € und variable Kosten = 48 €");
        System.out.println("Wichtel:   für Fixkosten = 25.000 € und variable Kosten = 43 €");
        System.out.println("Rentier:   für Fixkosten = 17.000 € und variable Kosten = 55 €");
        programm = sc.next();
        System.out.print("Anlage: " + programm + "\n\n");

    }

    public void verarbeitung (){

        if(programm.equals("Engel")){
            fixkosten = 22000;
            varKosten = 48;
        } else if (programm.equals("Witchel")){
            fixkosten = 25000;
            varKosten = 43;
        }else if (programm.equals("Rentier")){
            fixkosten = 17000;
            varKosten = 55;
        }


        stern = " ";
        ausgabe = " ";
        anzahl = 500;


        while(anzahl <= 5000){

            kosten = fixkosten+varKosten*anzahl;
            ertrag = verkaufspreis*anzahl;
            gewinn = ertrag-kosten;

            if (gewinn < 0){
                stern = ("****");
            }
           
            ausgabe+= (anzahl + "\t" + f1.format(kosten) + "\t" + f1.format(ertrag)+ "\t" + f1.format(gewinn) + stern + "\n");
            anzahl+=500;

            stern = " ";

        }
    }

    public void ausgabe (){

        System.out.println("Anzahl\t  Kosten\t  Ertrag\t  Gewinn\n");
        System.out.println(ausgabe);
        
    }

    public static void main (String []args){

        Produktionsprogramm pp = new Produktionsprogramm();

        Scanner sc1 = new Scanner(System.in);

        char wahl = 'j';

        System.out.println("\n\n");
        System.out.println("***********************************************************************");
        System.out.println("\t\tProduktionsprogramm");
        System.out.println("***********************************************************************");

        while (wahl == 'j' || wahl == 'J') {
            pp.eingabe();
            pp.verarbeitung();
            pp.ausgabe();
            System.out.print("\nMöchten Sie eine neue Berechnug durchführen(J/N)?");
            wahl = sc1.next().charAt(0);
        }
    }

}


