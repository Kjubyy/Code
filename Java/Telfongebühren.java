import java.util.*;
import java.text.*;

public class Telfongebühren {

    final double grundgebühren_50 = 7.50;
    final double grundgebühren_100 = 15.00;
    final int gratisminuten_50 = 50;
    final int gratisminuten_100 = 100;
    final double gebühreneinheitproMinute_50 = 0.40;
    final double gebühreneinheitproMinute_100 = 0.35;
    final double mwst = 19;

    int auswahl;

    String titel= " ";
    String ausgabe = " ";

    double grundGebühren;
    double gebühreneinheitproMinute;
    double kostenInsgesamt;
    double steuern;
    double verbindungsGebühr;
    double minutenproMonat;
    double gratisMinuten;

    DecimalFormat format = new DecimalFormat("#.## EUR");
    

public void eingabe(){

    Scanner sc = new Scanner(System.in);

    System.out.print("\nBitte wählen Sie Tarif aus!\n");

    while (auswahl < 1 || auswahl > 2 ) {

    System.out.print("(1:Relax 50 eco | 2:Relax 100 eco):");
    auswahl = sc.nextInt();

    if (auswahl < 1 || auswahl > 2) {
        System.out.println("Fehlermeldung: Falsche Eingabenummer");
    }
}

    System.out.println("Ihre Auswahl:"+ auswahl);
    System.out.print("Wie viele Minuten telefonieren Sie pro Monat:");
    minutenproMonat = sc.nextInt();

}

public void verarbeitung1(){

    if(auswahl == 1){
        titel = ("50 eco");
        grundGebühren = grundgebühren_50;
        gratisMinuten = gratisminuten_50;
        gebühreneinheitproMinute = gebühreneinheitproMinute_50;

    }
    else if (auswahl == 2){
        titel = ("100 eco");
        grundGebühren = grundgebühren_100;
        gratisMinuten = gratisminuten_100;
        gebühreneinheitproMinute = gebühreneinheitproMinute_100;
    }


    verbindungsGebühr = (minutenproMonat - gratisMinuten) *  gebühreneinheitproMinute;

    if ((minutenproMonat - gratisMinuten) <= 0) {
        verbindungsGebühr = 0;
      } 

    kostenInsgesamt = grundGebühren + verbindungsGebühr;
    steuern = kostenInsgesamt * mwst / (100 + mwst);

}

public void verarbeitung2(){

    int i = 0;
    while (i <=375 ) {

    i += 25;

    verbindungsGebühr =  gebühreneinheitproMinute * (i-100);
    if ((i - gratisMinuten) < 0) {
    verbindungsGebühr = 0;
    } 
      
    kostenInsgesamt = grundGebühren + verbindungsGebühr;

    ausgabe +=   "\t\t" +  i + "\t    " + format.format(grundGebühren) + "\t  " + format.format(verbindungsGebühr) + "\t     " + format.format(kostenInsgesamt) + " \n"; 
      
    }
 }

public void ausgabeTabelle(){

    System.out.println("\nTelefoneinheiten-Übersicht für Relax" + titel);
    System.out.println("\n-----------------------------------------------------------------------");
    System.out.println("Telefoneinheiten \t Grundgebühr \t Verbindungsgebühr \t Gesamtkosten");
    System.out.println("\n-----------------------------------------------------------------------");
    System.out.println(ausgabe);
}

public void ausgabe(){

    System.out.println("\n**********************************************************");
    System.out.println("\t Gebührenberechnug: Relax" + titel );
    System.out.println("**********************************************************\n");

    System.out.println("Grundgebühren im Monat:" + format.format(grundGebühren));
    System.out.println("darin sind " + gratisMinuten + " Gratisminuten enthalten.");
    System.out.println("Preis für jede weiter Telefoneinheit:" + format.format(gebühreneinheitproMinute) + "\n");

    System.out.println("Gsamt kosten für:" + minutenproMonat + "Telefoneinheiten (=Minuten):" + format.format(kostenInsgesamt));
    System.out.println("(inkl. 19,0 % MwSt:" + format.format(steuern));

   

}

public static void main (String []args){

    Telfongebühren Telfongebühren = new Telfongebühren();

    Scanner sc2 = new Scanner(System.in);

    char wahl = 'j';

    while (wahl == 'j' || wahl == 'J'){

        Telfongebühren.eingabe();
        Telfongebühren.verarbeitung1();
        Telfongebühren.verarbeitung2();
        Telfongebühren.ausgabe();
        Telfongebühren.ausgabeTabelle();
        System.out.print("Möchtes du das Programm wiederholen? (j/n)");
        wahl = sc2.next().charAt(0);
    }
}
}


