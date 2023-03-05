import java.util.*;
import java.text.*;

public class Porto {
    
    double einschreibGebühr = 2.05;
    
    double gewicht;
    double höhe;
    int einschreiben;
    
    double porto; 
    double betrag;
    String form;
    
    
    DecimalFormat format = new DecimalFormat("#.## Euro");
    
    
    public void eingabe(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Gewicht:");
        gewicht = sc.nextDouble();
        
        System.out.print("Höhe:");
        höhe = sc.nextDouble();
        
        System.out.print("Einschreiben (1 = Ja | 2 = Nein):");
        einschreiben = sc.nextInt();
    }
    
    public void rechnen(){
        
        if (gewicht <= 20 && höhe <= 5){
            porto = 0.58;
            form = ("Standertbreif");
        }
        else if (gewicht <= 50 && höhe <= 10){
            porto = 0.90;
            form = ("Kompaktbrief");
        } 
        else{
            porto = 1.45;
            form = ("Maxibrief");
        }
        
        if (einschreiben == 1){
            betrag = porto + einschreibGebühr;
        }
        else {
            betrag = porto; 
        }
    }
    
    public void ausgabe(){
        
        System.out.print("\n\nDas Porto für den " + form + " beträgt: " + format.format(betrag));
        if (einschreiben == 1){
        System.out.println("\n(inkl. Einschreibengebuehr von " + einschreibGebühr + " Euro)");
        }
    }
    
    public static void main (String[]args){
    
    Porto p = new Porto();
    
    p.eingabe();
    p.rechnen();
    p.ausgabe();
    
    } 
}