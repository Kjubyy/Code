public class MinMax{
    int[] zahlen = { 5,6, 8, 1, - 10, 8, 7, 6}; 
    int max;
    int min;

public void ermitteleMax(){

max = zahlen[0]; 

for (int i = 1; i < zahlen.length; i++){
    if (zahlen[i] > max){
        max = zahlen[i];   
    }
}

System.out.println("Größter Wert: " + max);

}

public void ermitteleMin(){

    min = zahlen[0];

    for (int i = 1; i < zahlen.length;i++){
        if (zahlen[i] < min){
            min = zahlen[i];
        }
    }

    System.out.println("Kleinster Wert: " + min);

}

public static void main (String[]args){

    MinMax mm = new MinMax();

    mm.ermitteleMax();
    mm.ermitteleMin();
}

}