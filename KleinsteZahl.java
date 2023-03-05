import java.util.*;

public class KleinsteZahl{
    
    double Zahl1;
    double Zahl2;
    double Zahl3;
    double KleinsteZahl;
    String Zahl;



public void eingabe(){
    Scanner sc = new Scanner(System.in);

    System.out.print("\tEingabe:");
    System.out.print("\n\tBitte geben sie die 1. Zahl ein:");
    Zahl1 = sc.nextDouble();
    System.out.print("\tBitte geben sie die 2. Zahl ein:");
    Zahl2 = sc.nextDouble();
    System.out.print("\tBitte geben sie die 3. Zahl ein:");
    Zahl3 = sc.nextDouble();
    System.out.print("\n");
    sc.close();
}

public void verarbeitung(){
    
    if (Zahl1 < Zahl2) {
        KleinsteZahl = Zahl1;
        Zahl = "Zahl.1";
    } else{
        KleinsteZahl = Zahl2;
        Zahl = "Zahl.2";
    }   
    if (KleinsteZahl < Zahl3) {
    } else{
        KleinsteZahl = Zahl3;
        Zahl = "Zahl.3";
    }
}

public void ausgabe(){
    System.out.println("\n\tDie kleinste Zahl:");
    System.out.println("\tZahl 1: " + Zahl1);
    System.out.println("\tZahl 2: " + Zahl2);
    System.out.println("\tZahl 3: " + Zahl3);
    System.out.println("\tist die "+Zahl+": "+KleinsteZahl);


}


public static void main(String[]args) {
    KleinsteZahl z1 = new KleinsteZahl();

    System.out.println("\n\t********************************************\n");
    System.out.println("\t\t\tKleinsteZahl");
    System.out.println("\n\t********************************************\n");

    z1.eingabe();
    z1.verarbeitung();
    z1.ausgabe();


}

}
     
    
    
    









