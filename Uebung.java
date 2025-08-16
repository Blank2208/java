public class Uebung {

    // Array-Uebung
    public static void foo(int[][] inputArray){
        System.out.println("Das übergebene Array der Funktion foo() besteht aus "+inputArray.length+" weiteren Arrays");
    }

    public static void main(String[] args){
        // Array-Uebung
        int[][] arr = {{12, 34, 10}, {74, 25, 19}}; // int[] = Array von Ganzzahlen; int[][] = Array von Arrays (hier zweidimensional); Als Tabelle: Zwei Zeilen und drei Spalten
        int sizeFirst = arr.length;  // Anzahl der Zeilen --> Zwei Arrays, also zwei Zeilen
        System.out.println("arr.length: " + arr.length);

        int sizeSec = arr[0].length; // Anzahl der Spalten --> Wir schauen hier nur auf das erste Array, da beide gleichlang
        System.out.println("arr[0].length: " + arr[0].length);

        int sizeWhole = sizeFirst * sizeSec;
        System.out.println("Das Array ist "+sizeFirst+"x"+sizeSec+" dimensional und besitzt deshalb insgesamt "+sizeWhole+" Elemente");

        int[][] arr2 = new int[34][74];
        System.out.println("arr2[0][0] = "+arr2[0][0]);

        foo(arr2);
    }
}
