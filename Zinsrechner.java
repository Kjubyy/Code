import java.util.*;
import java.text.*;

public class Zinsrechner{
  double Kapital;
  double Zinssatz;
  int Laufzeit;
  double Zinsrechner;
  
  DecimalFormat f2 = new DecimalFormat("#.####");
  
  
  
  public void eingabe(){
    Scanner sc = new Scanner(System.in);
    
    
    System.out.println("\tEingabe:");
    System.out.print("\tBitte geben sie ihr Kapital ein:");
    Kapital = sc.nextDouble();
    System.out.print("\tBitte geben sie den Zinssatz ein:");
    Zinssatz = sc.nextDouble();
    System.out.print("\tBitte geben Sie die Laufzeit in Jahren an:");
    Laufzeit = sc.nextInt();
    System.out.println("\n");
    sc.close();
    }
    
    
  public void rechnen(){
    Zinsrechner =  Kapital*Zinssatz*Laufzeit/100;
    
  }
    
  
  public void ausgabe(){
    System.out.println("\tErgebnis:");
    System.out.println("\tBei einer Laufzeit von "+Laufzeit+" Jahr/Jahren und einem Kapital von "+Kapital+" Euro erhalten sie "+f2.format(Zinsrechner)+" Euro Zinsen.\n\n" );
    
   } 
    
  
  public static void main(String[]args){
    
    Zinsrechner az1 = new Zinsrechner ();
    
    System.out.println("\n\t********************************************\n");
    System.out.println("\t\t\tZinsrechner");
    System.out.println("\n\t********************************************\n");
    
    
    az1.eingabe();
    az1.rechnen();
    az1.ausgabe(); 
    
    
    }
    
    
  }
    
    
    
    

    
      
