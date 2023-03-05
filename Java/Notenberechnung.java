import java.text.DecimalFormat;
import java.util.Scanner;



public class Notenberechnung {
    
    double maximalePunkzahl;
    double erreichtePunkzahl;

    double ab;     //Noten in Prozent
    int Noten;

    DecimalFormat format = new DecimalFormat("#.#");


    public void title(){

        System.out.println("\n************************************************");
        System.out.println("\t\tNotenberechnung");
        System.out.println("************************************************\n");

    }


    public void input(){

        Scanner nb = new Scanner(System.in);

        System.out.println("\nEingabe:");

        System.out.println("---------------------------------------------------");

        System.out.print("Wie viele Punkte konnteb Sie maximal erreichen?");
        maximalePunkzahl = nb.nextDouble();

        System.out.print("Wie viele Punkte haben Sie erreicht?");
        erreichtePunkzahl = nb.nextDouble();

        System.out.println("\n");

        nb.close();

    }


    public void berechnung(){

        ab = 100 / maximalePunkzahl * erreichtePunkzahl;

        if (ab >=95) {
            Noten = 15;
        }
        else if (ab >=90) 
            Noten = 14;
        
        else if (ab >=85) 
            Noten = 13;
        
        else if (ab >=80) 
            Noten = 12;
        
        else if (ab >=75) 
            Noten = 11;
        
        else if (ab >=70) 
            Noten = 10;
        
        else if (ab >=65) 
            Noten = 9;
        
        else if (ab >=60) 
            Noten = 8;
        
        else if (ab >=55) 
            Noten = 7;
        
        else if (ab >=50) 
            Noten = 6;
        
        else if (ab >=45) 
            Noten = 5;
        
        else if (ab >=40) 
            Noten = 4;
        
        else if (ab >=33) 
            Noten = 3;
        
        else if (ab >=27) 
            Noten = 2;
        
        else if (ab >=20) 
            Noten = 1;
        
        else if (ab <20) 
            Noten = 0;
        

    }


    public void output(){

        System.out.println("Ausgabe:");

        System.out.println("---------------------------------------------------");

        System.out.println("Sie haben " + erreichtePunkzahl + " von " + maximalePunkzahl + " Punkten erricht!");
        System.out.println("\nDas entspricht " + format.format(ab) + " Prozent und damit der Note: " + Noten + " Punkte.");
        System.out.println("\n\n");

    }


    public static void main (String[]args){

        Notenberechnung nb1 = new Notenberechnung();

        nb1.title();
        nb1.input();
        nb1.berechnung();
        nb1.output();

    }
}
