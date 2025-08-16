
import java.util.Scanner;

import java.util.Arrays;

// Klasse, wo alle Uebungsaufgaben-Funktionen definiert werden sollen
public class Aufgaben {

    // Aufgabe: Programm schreiben, dass eine Zeichenfolge einliest und prüft, ob Palindrom
    public static void palindrome(String userInput){
        boolean is_palindrome = true;

        char[] userInputAsCharArray = userInput.toLowerCase().toCharArray();
        int lastCharOfUserInput = userInput.length() - 1;
        for (int i = 0; i < userInput.length(); i++){
            if (userInputAsCharArray[i] != userInputAsCharArray[lastCharOfUserInput]){
                is_palindrome = false;
                break;
            }
            lastCharOfUserInput--;
        }
        if(is_palindrome){
            System.out.println("Das Wort " + userInput + " ist ein Palindrom!");
        }
        else{
            System.out.println("Das Wort " + userInput + " ist kein Palindrom!");
        }
    }


    // Aufgabe: Programm schreiben, welches eine Liste prüft, ob diese aufsteigend sortiert ist
    public static void isSorted(int[] array){
        boolean isSortiert = true;
        for (int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i+1]){
                isSortiert = false;
                break;
            }
        }
        if (isSortiert){
            System.out.println("Die Liste " + Arrays.toString(array) + " ist sortiert!");
        }
        else{
            System.out.println("Die Liste " + Arrays.toString(array) + " ist nicht sortiert!");
        }
    }


    // Aufgabe: Methode transpose() implementieren, die als param m x n Matrix bekommt und diese transponiert ausgibt, also n x m
    public static void transpose(int[][] matrix){
        System.out.println(Arrays.deepToString(matrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));

        int m = matrix.length;  // Anzahl Zeilen
        int n = matrix[0].length; // Anzahl der Spalten

        int[][] transposedMatrix = new int [n][m]; // Erstellt neue Matrix mit der Anzahl Spalten als Zeilen und Anzahl Zeilen als Spalten

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                transposedMatrix[i][j] = matrix[j][i]; //
            }
        }
        System.out.println(Arrays.deepToString(transposedMatrix).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
    }


    public static void main(String[] args){
        Scanner user_input = new Scanner(System.in);
        System.out.println("Geben Sie bitte eine Zeichenfolge ein!");
        String input = user_input.nextLine();
        palindrome(input);
        user_input.close(); // Scanner schliessen zwecks Memory leak


        // Array darauf pruefen, ob sortiert oder nicht
        int[] array = {8, 4, 5, 6};
        isSorted(array);


        // Matrix
        int[][] matrix = {{1,2,3}, {4,5,6}};
        transpose(matrix);
    }
}
