import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoGame {
    public static void main(String[] args) {
        int maxNumber = 49; // Die höchste Zahl, die getippt werden kann
        int numbersToPick = 6; // Anzahl der Zahlen, die der Benutzer auswählen kann
        
        // Array für die Zahlen des Benutzers und für die gezogenen Zahlen
        int[] userNumbers = new int[numbersToPick];
        int[] lotteryNumbers = new int[numbersToPick];
        
        // Scanner für die Eingabe des Benutzers
        Scanner scanner = new Scanner(System.in);
        
        // Zufällige Zahlen generieren und in das lotteryNumbers-Array einfügen
        Random random = new Random();
        for (int i = 0; i < numbersToPick; i++) {
            int randomNumber = random.nextInt(maxNumber) + 1;
            while (contains(lotteryNumbers, randomNumber)) {
                randomNumber = random.nextInt(maxNumber) + 1;
            }
            lotteryNumbers[i] = randomNumber;
        }
        
        // Zahlen des Benutzers einlesen und in das userNumbers-Array einfügen
        System.out.println("Bitte geben Sie " + numbersToPick + " Zahlen zwischen 1 und " + maxNumber + " ein:");
        for (int i = 0; i < numbersToPick; i++) {
            System.out.print("Zahl " + (i+1) + ": ");
            int number = scanner.nextInt();
            while (number < 1 || number > maxNumber || contains(userNumbers, number)) {
                System.out.println("Ungültige Eingabe, bitte geben Sie eine Zahl zwischen 1 und " + maxNumber + " ein, die Sie noch nicht eingegeben haben:");
                number = scanner.nextInt();
            }
            userNumbers[i] = number;
        }
        
        // Ausgabe der gezogenen Zahlen und der vom Benutzer eingegebenen Zahlen (sortiert mit der Bubble-Sort-Methode)
        System.out.println("Die gezogenen Zahlen sind: " + Arrays.toString(lotteryNumbers));
        bubbleSort(userNumbers);
        System.out.println("Ihre Zahlen sind: " + Arrays.toString(userNumbers));
        
        // Anzahl der richtigen Treffer ermitteln
        int correctNumbers = countMatches(userNumbers, lotteryNumbers);
        System.out.println("Sie haben " + correctNumbers + " Zahlen richtig getippt.");
    }
    
    // Methode, die überprüft, ob ein Array eine bestimmte Zahl enthält
    public static boolean contains(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }
    
    // Methode, die zwei Arrays vergleicht und die Anzahl der übereinstimmenden Elemente zurückgibt
    public static int countMatches(int[] array1, int[] array2) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
    
    // Methode, die ein Array mit der Bubble-Sort-M