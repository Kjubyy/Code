import java.util.*;

public class Test4 {
    String Name;
    double money;
    boolean Osternfan;
    int Eier;
    


    public void eingabe(){
        Scanner SC = new Scanner(System.in);
        System.out.print("Bitte geben sie ihren Namen ein:");
        Name = SC.next();
        System.out.print("Bitte geben sie ihren Grundlohn ein (€):");
        money = SC.nextDouble();
        System.out.print("Sind die Osternfan?");
        Osternfan = SC.nextBoolean();
        System.out.print("Wie viele Eier haben sie gefärbt?");
        Eier = SC.nextInt();
        SC.close();
    }

    public void ausgabe(){
        System.out.println("Hallo Herr " + Name + "! Hier ein Überblick über deine Daten:");
        System.out.println("--------------------------------");
        System.out.println("Grundlohn: \t " + money + " EUR");
        System.out.println("Du bist ein Osternfan? " +Osternfan);
        System.out.println("Anzahl der gefärbten Eier: " + Eier + " Stück");
    }


    public static void main(String[] args) {
        Test4 B1 = new Test4();
        B1.eingabe();
        B1.ausgabe();
    }
}
