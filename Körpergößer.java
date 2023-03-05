import java.util.*;
import java.text.*;




public class Körpergößer {

    double oberschenkel;
    int alter;
    int geschlecht;
    double größe;
    String geschlecht2;

    DecimalFormat f1 = new DecimalFormat("#.##");
    

    





    public void eingabe() {

        Scanner sc = new Scanner(System.in);

        System.out.print("\tWie lang sind Ihre Oberschenkel (in m)?");
        oberschenkel = sc.nextDouble();
        System.out.print("\tWie alt sind Sie?");
        alter = sc.nextInt();
        System.out.print("\tSind sie meanlich (1) oder weiblich (2)?");
        geschlecht = sc.nextInt();

        sc.close();

        
     }


    public void rechnen() {

        if (geschlecht ==1) {
            größe = 2.238 * oberschenkel + 0.69089;
            geschlecht2 = ("männlich");
            
                if (alter > 30){
                    größe = größe-0.0006*(alter-30);  
                }
        }

        else if (geschlecht ==2) {
            größe = 2 * oberschenkel + 0.61417;
            geschlecht2 = ("weiblich");

                if (alter > 30){
                    größe = größe-0.0060*(alter-30);  
                }
        }

        else if (geschlecht < 1 || geschlecht > 2){
            System.out.println("\t\n\nFEHLER: Bitte geben Sie die Zahl 1 oder 2 ein");

        } while (geschlecht < 1 || geschlecht > 2);
        
    }


    public void ausgabe() {
        
        System.out.println("\n\tAuswertung:");
        System.out.println("\tSie sind " + alter + " Jahre alt, " + geschlecht2 + " und haben");
        System.out.println("\teine Oberschenkellänge von " + oberschenkel + " m.\n");
        System.out.println("\tSie sind "+ geschlecht2 +" und wahrscheinlich "+ f1.format(größe) +" m groß");


    }


    public static void main(String[]args){

    Körpergößer k1 = new Körpergößer();

    System.out.println("\n\t********************************************\n");
    System.out.println("\t\t\tKörpergröße");
    System.out.println("\n\t********************************************\n");

    k1.eingabe();
    k1.rechnen();
    k1.ausgabe();
    
    }

}








