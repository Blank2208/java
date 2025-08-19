// Zum Ausführen: javac uebung02\Search.java und danach: java uebung02.Search

package uebung02;

public class Search {

    public static int search(int[] elements, int key){
        int laufVariable = 0;
        for(int element : elements){
            if(element == key){
                return laufVariable;
            }
            else{
                laufVariable++;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){

        int[] arr = {1, 2, 3, 1, 4, 5};
        int search = search(arr, 8);

        if (search == -1){
            System.out.println("Element is not in list!"); // sout + tab als shortcut
        }
        else{
            System.out.println("The first place of the element is in index: " + search);
        }
    }
}
