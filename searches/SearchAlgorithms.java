package searches;

public class SearchAlgorithms {

        public static int linearSearch(int[] elementsArray, int element){
            int laufVariable = 0;
            for(int currentElement : elementsArray){
                if(currentElement == element){
                    return laufVariable;
                }
                else{
                    laufVariable++;
                }
            }
            return -1;
        }


        public static int linearSearchCount(int[] elementsArray, int element){
            int currentCount = 0;
            for(int currentElement : elementsArray){
                currentCount++;
                if(currentElement == element){
                    return currentCount;
                }
            }
            return currentCount;
        }


    public static int binarySearch(int[] elementsArray, int element) {
        int left = 0;   // Kennzeichnet das erste Element
        int right = elementsArray.length - 1;   // Kennzeichnet die gesamte Laenge - 1

        while (left <= right) {
            int mid = (left + right) / 2;   // Bildet das Center für den Start

            if (elementsArray[mid] == element) {
                return mid; // Element gefunden
            } else if (element < elementsArray[mid]) {
                right = mid - 1;  // rechts verkleinern
            } else {
                left = mid + 1;   // links verschieben
            }
        }

        return -1; // Element nicht gefunden
    }




    public static void main(String[] args){
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int search = linearSearch(arr, 8);

            int test = binarySearch(arr, 4);
            System.out.println("Test: " + test);
            if (search == -1){
                System.out.println("Element is not in list!"); // sout + tab als shortcut
            }
            else{
                System.out.println("The first place of the element is in index: " + search);
            }
        }
    }

