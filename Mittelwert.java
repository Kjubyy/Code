import java.util.*;
import java.text.*;


public class Mittelwert{
  
  int zahlen = 0;

  double mittelwert;
  double temp = 0;
  double eingabe;

  String jaNein;

  boolean loop = true;

  static String repeat;
  static boolean wiederholen = true;
  static Scanner sc = new Scanner(System.in);
  
  ArrayList<Double> list = new ArrayList<>();

  DecimalFormat format = new DecimalFormat("#.##");

  
  public void title(){
    
    System.out.println("\n************************************************");
    System.out.println("\t\tMittelwert-Berechnung");
    System.out.println("************************************************\n");
    
  }
  
  public void input(){
     
    while (loop == true) { 

      zahlen++;
  
      System.out.print("Bitte geben Sie die " + zahlen + ".Zahl ein:");
      eingabe = sc.nextDouble();
      list.add(eingabe);

      System.out.print("Möchten Sie eine weitere eingabe (J,N)?");
      jaNein = sc.next();
      
      if (jaNein.equals("J")){
          loop = true;
      }else if (jaNein.equals("j")){
          loop = true;
      }else {
          loop = false;
      }
     
    } 
    
  }
  
  public void verarbeiten(){

    int i = 0;

    while ( i < list.size()){
      temp = temp + list.get(i);
      i++;

    }
    
    mittelwert = temp/zahlen;
    temp = 0;

  }
  
  public void output(){

    System.out.println("\n\nDer Mittelwert von den Zahlen:");

    for (int i = 0; i < list.size(); i++) {
      
      System.out.println(i + 1 + ". Zahl:" + list.get(i));
      
    }
    
      System.out.println("Der Mittelwert " + mittelwert);

      System.out.print("\n\nMöchten Sie eine neue Berechnung durchführen(J/N)?");
      repeat = sc.next();
      
      list.clear();
      
      

  }

  public static void main(String[]args){
    
      while (wiederholen == true) {

      Mittelwert mw1 = new Mittelwert();

      mw1.title();
      mw1.input();
      mw1.verarbeiten();
      mw1.output();

      if (repeat.equals("J")){
        wiederholen = true;
      } else if (repeat.equals("j")){
        wiederholen = true;
      }else {
        wiederholen = false;
        System.exit(2);
      }


    }
  }
}