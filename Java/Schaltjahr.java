import java.util.*;
import java.text.*;



public class Schaltjahr {
  
  
  int jahrZahl;
  String ergebnis;
  
  
  
  public void eingabe(){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("\tBitte geben Sie die Jahreszahl ein:  ");
    jahrZahl = sc.nextInt();
    
    
  }
  
  
  public void verarbeitung(){
    
    if (jahrZahl % 4 == 0 && jahrZahl % 100 != 0 || jahrZahl % 400 == 0) {
      ergebnis = ("Das Jahr " + jahrZahl + "ist ein Schaltjahr ");
    } else {
        ergebnis = ("Das Jahr " + jahrZahl + "ist kein Schaltjahr"); 
    }
    
    
    
    
  }
  
  
  public void ausgabe(){
    
    System.out.println("\t"+ergebnis); 
    
  }
  
  
  public static void main(String[] args) {
    
    Schaltjahr sj1 = new Schaltjahr();
    
    sj1.eingabe();
    sj1.verarbeitung();
    sj1.ausgabe();
    
  }
} 

  