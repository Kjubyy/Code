import java.util.Scanner;



public class Grundrechenarten{

    double Zahl1;
    double Zahl2;
    String eingabe;

    double ergebnis;
    String rechenZeichen;
    



    public void title(){

        System.out.println("\n************************************************");
        System.out.println("\t\tGrundrechenarten");
        System.out.println("************************************************\n");

    }


    public void input(){

        Scanner ga = new Scanner(System.in);

        System.out.println("Zahleneingabe:");
        System.out.println("---------------------------------------------------");

        System.out.print("Bitte geben Sie die 1.Zahl ein:");
        Zahl1 = ga.nextDouble();

        System.out.print("Bitte geben Sie die 2.Zahl ein:");
        Zahl2 = ga.nextDouble();

        System.out.println("\nAuswahl:");
        System.out.println("---------------------------------------------------");
        System.out.println("Welche Grundrechenart möchten Sie auswählen:");
        System.out.println("1. Addition\n2. Subtraktion\n3. Multiplikation\n4. Division");

        System.out.print("Eingabe Ergebnis: ");
        eingabe = ga.next();

        ga.close();

    }

    public void rechnung(){

        switch(eingabe) {

            case "1":
                rechenZeichen = ("+");
                ergebnis = Zahl1 + Zahl2
            ;break;
            case "2":
                rechenZeichen = ("-");
                ergebnis = Zahl1 - Zahl2
            ;break;
            case "3":
                rechenZeichen = ("*");
                ergebnis = Zahl1 * Zahl2
            ;break;
            case "4":
                rechenZeichen = ("/");
                ergebnis = Zahl1 / Zahl2
            ;break;
            default:System.out.println("Falsches Rechenzeichen");

            System.exit(0);
           
        }
        


        
    }


    public void output(){

        System.out.println("\nAusgabe Ergebnis:");
        System.out.println("---------------------------------------------------");
        System.out.println(Zahl1 + " " +  rechenZeichen + " " +  Zahl2 + " = " + ergebnis);
        System.out.println("\n\n");
    }


    public static void main(String[]args){

        Grundrechenarten gra1 = new Grundrechenarten();

        gra1.title();
        gra1.input();
        gra1.rechnung();
        gra1.output();
    }





}