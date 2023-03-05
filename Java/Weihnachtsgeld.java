import java.util.*;
import java.text.*;

public class Weihnachtsgeld{

    final double zusatz1 = 10.00;
    final double zusatz2 = 75.00;
    final double fix1 = 75.00;
    final double fix2 = 25.00;

    int alter;
    int geburtsjahr;
    int arbeitsjahre;

    double weihnachtsgeld;
    double spenden;

    String name;
    String sos;

    DecimalFormat format = new DecimalFormat("#.## EUR");


    public void eingabe(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Wie heißen Sie:");
        name = sc.nextLine();

        System.out.print(name + " wann sind Sie geboren:");
        geburtsjahr = sc.nextInt();

        System.out.print(name + " Wie lange arbeiten sie schon in Jahren (yyyy):");
        arbeitsjahre = sc.nextInt();

        System.out.print("\n");
    }

    public void rechnung(){

        alter = 2022 - geburtsjahr;

        if(arbeitsjahre >=5){
           weihnachtsgeld = fix1 + zusatz1 * arbeitsjahre;
        } else if(arbeitsjahre >=5 && alter >=50){
            weihnachtsgeld = fix1 + zusatz2 * arbeitsjahre;
        } else if(arbeitsjahre >=2){
            weihnachtsgeld = fix2;
        } else {
            weihnachtsgeld = 0;
        }

        if(weihnachtsgeld > 300){
            spenden = weihnachtsgeld - 300;
            sos = ("\nSie spenden einen betrag von " + format.format(spenden));
        }
    }

    public void ausgabe(){

        System.out.print(name + " ist " + alter + " alt und hat ein Weihnachtsgeld von " + format.format(weihnachtsgeld));

        if(weihnachtsgeld > 300){
            System.out.print(sos);
        }
    }

    public static void main (String [] args) {

        System.out.print("--------------------------------------------------------------\n");
        System.out.print("\t\tWeihnachtsgeld");
        System.out.print("\n--------------------------------------------------------------\n\n");



        Weihnachtsgeld wg = new Weihnachtsgeld();

        wg.eingabe();
        wg.rechnung();
        wg.ausgabe();
    }







}
