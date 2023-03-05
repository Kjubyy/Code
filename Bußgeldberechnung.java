import java.text.DecimalFormat;
import java.util.Scanner;



public class Bußgeldberechnung {


    String kenziffer;
    double höchstgeschwindigkeit;
    double gefahreneGeschwindigkeit;
    int strafpunkte;
    int fahrverbot;
    double bussgeld;
    double geschwindigkeitsüberschreitung;
    String monate;



    DecimalFormat format = new DecimalFormat("#.#");


    public void title(){

        System.out.println("\n************************************************");
        System.out.println("\t\tBussgeld-Berechnung");
        System.out.println("************************************************\n");

    }


    public void input(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Eingabe:");
        System.out.println("---------------------------------------------------");
        System.out.println("Wo haben Sie die Geschwindigkeitsüberschreitung begangen?");
        System.out.println("1: innerhalb geschlossener Ortschaften,");
        System.out.println("2: ausserhalb geschlossener Ortschaften");
        System.out.print("Bitte geben Sie die entsprechende Kenziffer ein:");
        kenziffer = sc.next();

        System.out.println("Wie hoch ist die erlaubte Höchstgeschwindigkeit (in km/h)");
        System.out.print("auf dieser Strasse?");
        höchstgeschwindigkeit = sc.nextDouble();

        System.out.print("Wie schnell sind Sie gefahren?");
        gefahreneGeschwindigkeit = sc.nextDouble();

        sc.close();

    }


    public void berechnung(){

        if (gefahreneGeschwindigkeit < 100){
            gefahreneGeschwindigkeit = gefahreneGeschwindigkeit - 3;
        }else if (gefahreneGeschwindigkeit > 100){
            gefahreneGeschwindigkeit = gefahreneGeschwindigkeit - (gefahreneGeschwindigkeit/100*3);
        }


        geschwindigkeitsüberschreitung = gefahreneGeschwindigkeit - höchstgeschwindigkeit;


        switch(kenziffer) {

            case "2":
                kenziffer = ("auserorts");

                if (geschwindigkeitsüberschreitung > 70) {
                    bussgeld = 800; strafpunkte = 2;  fahrverbot = 3;
                }
                else if (geschwindigkeitsüberschreitung >= 60) {
                    bussgeld = 700; strafpunkte = 2; fahrverbot = 3;
                }
                else if (geschwindigkeitsüberschreitung >= 50) {
                    bussgeld = 600; strafpunkte = 2; fahrverbot = 2;
                }
                else if (geschwindigkeitsüberschreitung >= 40) {
                    bussgeld = 400; strafpunkte = 2; fahrverbot = 1;
                }
                else if (geschwindigkeitsüberschreitung >= 30) {
                    bussgeld = 260; strafpunkte = 2; fahrverbot = 1;
                }
                else if (geschwindigkeitsüberschreitung >= 25) {
                    bussgeld = 180; strafpunkte = 1; 
                }
                else if (geschwindigkeitsüberschreitung >= 20) {
                    bussgeld = 115; strafpunkte = 1; 
                }
                else if (geschwindigkeitsüberschreitung >= 15) {
                    bussgeld = 70; strafpunkte = 1; 
                }
                else if (geschwindigkeitsüberschreitung >= 10) {
                    bussgeld = 50; 
                }
                else if (geschwindigkeitsüberschreitung < 10) {
                    bussgeld = 30; 
                }
                break;
            
            case "1":
                kenziffer = ("innerorts");

                if (geschwindigkeitsüberschreitung > 70) {
                    bussgeld = 700; strafpunkte = 2;  fahrverbot = 3;
                }
                else if (geschwindigkeitsüberschreitung >= 60) {
                    bussgeld = 600; strafpunkte = 2; fahrverbot = 2;
                }
                else if (geschwindigkeitsüberschreitung >= 50) {
                    bussgeld = 480; strafpunkte = 2; fahrverbot = 1;
                }
                else if (geschwindigkeitsüberschreitung >= 40) {
                    bussgeld = 320; strafpunkte = 2; fahrverbot = 1;
                }
                else if (geschwindigkeitsüberschreitung >= 30) {
                    bussgeld = 200; strafpunkte = 2; fahrverbot = 1;
                }
                else if (geschwindigkeitsüberschreitung >= 25) {
                    bussgeld = 150; strafpunkte = 1; 
                }
                else if (geschwindigkeitsüberschreitung >= 20) {
                    bussgeld = 60; 
                }
                else if (geschwindigkeitsüberschreitung >= 15) {
                    bussgeld = 40; 
                }
                else if (geschwindigkeitsüberschreitung < 10) {
                    bussgeld = 20; 
                }break;
                default:System.out.println("Sie haben die falsche Kennziffer eingegeben!");
                System.exit(0);


        }

        if (fahrverbot == 1){
            monate = ("Monat");
        }
        else if (fahrverbot == 2 || fahrverbot == 3){
            monate = ("Monate");
        }
    }


    public void output(){

        System.out.println("\nAusgabe:");
        System.out.println("---------------------------------------------------");
        System.out.println("Sie haben sich nicht an die Vorschrifften gehalten und");
        System.out.println("sind " + kenziffer + " " + format.format(geschwindigkeitsüberschreitung) + " km/h zu schnell gefahren.");

        System.out.println("\nSie müssen " + bussgeld + " Euro bezahlenm bekommen " + strafpunkte + " Strafpunkte");
        System.out.println("und " + fahrverbot + " " + monate + " Fahrverbot.");


    }


    public static void main (String[]args){

        Bußgeldberechnung bg = new Bußgeldberechnung();

        bg.title();
        bg.input();
        bg.berechnung();
        bg.output();
    }
}
