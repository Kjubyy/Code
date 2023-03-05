import java.util.*;

public class ExponentialFunktion{

    double zahl;
    double exponent;
    double ausgabe ;

    public void eingabe(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Geben Sie eine zahl ein, die Sie potenzieren möchten:");
        zahl = sc.nextDouble();

        System.out.print("Bitte geben Sie den Exponenten ein:");
        exponent = sc.nextDouble();

    }

    public void potenzieren(){

        ausgabe = Math.pow(zahl, exponent);

    }

    public void ausgabe(){

        System.out.println("\n" + zahl + " hoch " + exponent + " = " + ausgabe);

    }

    public static void main (String[]args){

        ExponentialFunktion ef = new ExponentialFunktion();

        Scanner sc2 = new Scanner(System.in);

        char wiederholen = 'j';

        System.out.println("*****************************************************************************");
        System.out.println("\t\t\tExponential-Funktion");
        System.out.println("*****************************************************************************\n");


        while (wiederholen == 'j' || wiederholen == 'J'){
            
            ef.eingabe();
            ef.potenzieren();
            ef.ausgabe();
            System.out.print("\nMöchten Sie eine neue Berechnung durchführen (J/N):");
            wiederholen = sc2.next().charAt(0);

        }
    }
}