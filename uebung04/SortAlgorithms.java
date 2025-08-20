package uebung04;

import java.util.Arrays;

public class SortAlgorithms {

    public static void swap(int[] array, int a, int b){
        int currentPosition = array[a];
        array[a] = array[b];
        array[b] = currentPosition;
    }


    public static void bubbleSort(int[] array){
        int start;
        int end = array.length;

        for(start = 0; start < end; start++){
            for(int lastElement = end - 1; lastElement > start; lastElement--){
                if(array[lastElement] < array[lastElement - 1]){    // bspw. lastElement = index 2: 4 und das andere index 1: 6
                    swap(array,lastElement-1, lastElement );    // Ergebnis: die 6 wäre jetzt im index 2 und die 4 in index 1.
                }
            }
        }

    }


    public static void selectionSort(int[] array){
        int currentMinimum;
        for(int i = 0; i < array.length; i++){
            currentMinimum = i;
            for(int selectedElement = i; selectedElement < array.length; selectedElement++){
                if(array[selectedElement] < array[currentMinimum]){
                    currentMinimum = selectedElement;   // Ausgewaehltes Element ist kleiner als das momentane kleinste Element
                }
            }
            swap(array, i, currentMinimum); // i wird getauscht, da es die aktuelle kleinste Indexnummer angibt, während currentMinimum die Indexnummer hat, wo der kleinste Wert drin ist
        }

    }




    public static void main(String[] args){
        int[] arr = {2, 1, 5, 3};
        System.out.println("Aktuelle Liste: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Neue Liste: " + Arrays.toString(arr));


        int[] arr1 = {2, 1, 5, 3};
        System.out.println("Alte Liste vor Selection Sort: " + Arrays.toString(arr1));
        selectionSort(arr1);

        System.out.println("Neue Liste nach Selection Sort: " + Arrays.toString(arr1));
    }
}
