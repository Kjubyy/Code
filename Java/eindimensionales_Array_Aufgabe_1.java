import java.util.Scanner;

public class eindimensionales_Array_Aufgabe_1{

    int[] zahlen = {2, 5, 26, 13, 11, 32};

    public void verschiebeZahlenNachLinks(){
        
        if  (zahlen.length <= 1){

            return;

        }
        // temp bekommt den ersten Wert aus dem Array
        int temp = zahlen[0];

        for (int i = 0; i < zahlen.length-1; i++){

         zahlen[i] = zahlen[i+1];
            
        }

        zahlen[zahlen.length-1] = temp;

        for (int i = 0; i < zahlen.length; i++){

            System.out.println(zahlen[i]);

            zahlen[i] = zahlen[i];

        }

    }   

    public static void main(String[] args){

        eindimensionales_Array_Aufgabe_1 obj = new eindimensionales_Array_Aufgabe_1();

        char wiederholen = 'j';

        Scanner sc = new Scanner(System.in);

        do{
        obj.verschiebeZahlenNachLinks();
        System.out.print("\nMöchtes du wiederholen(J/N)?");
        wiederholen = sc.next().charAt(0);
        } while(wiederholen == 'j' || wiederholen == 'J');

    }
    
}