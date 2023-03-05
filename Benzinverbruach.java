import java.util.*;
import java.text.*;



public class Benzinverbruach{
  int lzk;             //letzter Kilomterstand
  int nk;              //aktueller Kilomterstand
  int mg;              //menge Benzin
  double dsb;          //durchschnitt Benzinverbrauch
  double gefahren;
  
  DecimalFormat f1 = new DecimalFormat("#.##");
  
public void eingabe(){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Eingabe:");
    System.out.println("\nBitte geben Sie den Kilometerstand beim letzten Tanken ein:");
    lzk = sc.nextInt();
    System.out.println("\nBitte geben Sie den aktuellen Kilometerstand ein:");
    nk = sc.nextInt();
    System.out.println("\nBitte geben Sie die Menge der getankten Liter Benzin ein:");
    mg = sc.nextInt();
    System.out.println("\n");
    sc.close();
   }
  
public void verarbeitung(){
    gefahren = nk-lzk;
    dsb = mg/gefahren*100;
    
  }
  
  
public void ausgabe(){
  System.out.println("Auswertung:");
  System.out.println("\nDer durchschnittliche benzinverbrauch beträgt "+f1.format(dsb)+" Liter pro");
  System.out.println("\npro gefahrene 100 Kilomter, wenn Sie "+gefahren+" Kilomter gefahren");
  System.out.println("\nsind und "+mg+" Liter getankt haben.");
    }
    
  
public static void main(String[]args){
  Benzinverbruach az1 = new Benzinverbruach();
    
    
    System.out.println("\n***************************************************************\n");
    System.out.println("\t\tBerechnung Benzinverbrauch");
    System.out.println("\n***************************************************************\n");
    
    az1.eingabe();
    az1.verarbeitung();
    az1.ausgabe();
    
 } 
}   
     
  
