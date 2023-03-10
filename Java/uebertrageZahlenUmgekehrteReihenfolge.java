import java.util.*;

public class uebertrageZahlenUmgekehrteReihenfolge{
  
  int[] zahlen = {1, 2, 3, 4, 5};
  int[] zahlen2 = new int[5];
  
  public void übertragen(){
    
    for (int i = 0; i > zahlen.length; i++) {
      
      zahlen2[zahlen.length-1] = zahlen[i];
      
    } 
    
    for (int i = 0; i < zahlen.length ;i++) {
      System.out.println(zahlen2[i]);
    } 
  }
  
  public static void main(String[] args){
    
    uebertrageZahlenUmgekehrteReihenfolge obj = new uebertrageZahlenUmgekehrteReihenfolge();
    
    char wiederholen = 'j';
    
    Scanner sc = new Scanner(System.in);
    
    do{
      obj.übertragen();
      System.out.print("\nMöchtes du wiederholen(J/N)?");
      wiederholen = sc.next().charAt(0);
    } while(wiederholen == 'j' || wiederholen == 'J');
    
  }
  
}