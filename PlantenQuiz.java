import java.util.*;

public class PlantenQuiz{

    int richtig;

    static Scanner sc = new Scanner(System.in);

    String[] planeten = {"Merkur", "Venus", "Erde", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun"};
    String[] eingabePlaneten;



    public void eingabe(){

        int anzahl;

        System.out.print("Wie viele Planeten kennen Sie?");
        anzahl = sc.nextInt();
        if (anzahl > 8){
            System.out.print("Hinweis: Es gibt nur 8 Planeten!\n\n");
        }
       
        while(anzahl > 8){

            System.out.print("Wie viele Planeten kennen Sie?");
            anzahl = sc.nextInt();

        }    

        eingabePlaneten = new String[anzahl];

        for(int i = 0; anzahl > i; i++){

            System.out.print(i+1 + ". Planet: ");
            eingabePlaneten[i] = sc.next();

        }
    }

    public void vergleichPlaneten(){

        richtig = 0;
    
        System.out.print("\n");
    
        for (int i = 0; i < eingabePlaneten.length; i++){
    
            System.out.println(i+1 + ". Planet: " + eingabePlaneten[i]);
    
            for (int j = 0; j < planeten.length; j++){

                if (eingabePlaneten[i].equalsIgnoreCase(planeten[j])){

                    richtig++;
                    break;

                }
            }
        }
    
        System.out.print("Sie haben " + richtig + " von " + eingabePlaneten.length + " richtig.");
    }

    public static void main(String []args){

        PlantenQuiz PlantenQuiz = new PlantenQuiz();

        char wiederholen = 'j';

        while (wiederholen == 'j' || wiederholen == 'J'){

        PlantenQuiz.eingabe();
        PlantenQuiz.vergleichPlaneten();
        
        System.out.print("Möchten Sie es noch einmal versuchen?");
        wiederholen = sc.next().charAt(0);

        }  
    }
}