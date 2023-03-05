import java.text.DecimalFormat;
import java.util.Scanner;



public class BodyMassIndex {

    int gewicht;
    double körpergößer;

    double bmi;
    String ergebnis;


    DecimalFormat format = new DecimalFormat("#.##");




     public void title(){

        System.out.println("\n\t************************************************\n");
        System.out.println("\t\t\tBodyMassIndex");
        System.out.println("\n\t************************************************\n");

    }


    public void input(){

        Scanner bm = new Scanner(System.in);

        System.out.print("\tBitte geben Sie ihr Gewicht (in kg) ein:");
        gewicht = bm.nextInt();

        System.out.print("\tBitte geben Sie ihre Körpergröße (in m) ein:");
        körpergößer = bm.nextDouble();

        System.out.println("\n");
    
        bm.close();
    }


    public void bmirechnen(){

        bmi = gewicht / Math.pow(körpergößer, 2);

        if (bmi < 19) {
            ergebnis = ("Sie haben Untergewicht!");
        }

        if (bmi >= 19 && bmi < 25) {
            ergebnis = ("Sie haben Normalgewicht!");
        }

        if (bmi >= 25 && bmi <30) {
            ergebnis = ("Sie haben Übergewicht!");
        }

        if (bmi >=30) {
            ergebnis = ("Sie haben starkes Übergewicht!");
        }
    }


    public void output(){

        System.out.println("\tIhr Body-Mass-Index (BMI) beträgt: " + format.format(bmi));
        System.out.println("\t" + ergebnis + "\n\n");
    }


    public static void main(String[]args){

        BodyMassIndex BMI = new BodyMassIndex();

        BMI.title();
        BMI.input();
        BMI.bmirechnen();
        BMI.output();

    }







}
