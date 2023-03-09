import java.util.Scanner;

public class verschiebeZahlenNachRechts{
  
  int[] zahlen = {2, 5, 26, 13, 11, 32};
  
  public void verschieben(){
    
    if  (zahlen.length <= 1){
      
      return;
      
    }
    
    
    int temp = zahlen[zahlen.length-1];
    
    for (int i = zahlen.length-1; i >= 0; i--){
      
      zahlen[i] = zahlen[zahlen.length-(i+1)];
      
    }
    
    zahlen[0] = temp;
    
    for (int i = 0; i < zahlen.length; i++){
      
      System.out.println(zahlen[i]);
      
      zahlen[i] = zahlen[i];
      
    }
    
  }   
  
  public static void main(String[] args){
    
    verschiebeZahlenNachRechts obj = new verschiebeZahlenNachRechts();
    
    obj.verschieben();
    
  }
  
}