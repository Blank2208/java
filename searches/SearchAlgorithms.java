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


        // Return only the last index of the element
        public static int linearSearchLast(int[] elementsArray, int element){
            int currentCount = 0;
            int index = -1;
            for (int currentElement : elementsArray){
                System.out.println("elementsArray[]: " + currentElement);
                if(currentElement == element){
                    index = currentCount;
                    System.out.println("Index: " + index);
                }
                currentCount++;
                System.out.println("New Count: " + currentCount);
            }
            return index;
        }


        public static String linearSearchAll(int[] elementsArray, int element){
            int currentCount = 0;
            String index = "";
            for(int currentElement : elementsArray){
                if(currentElement == element){
                    index += currentCount + ", ";
                }
                currentCount++;
            }
            System.out.println("Index: " + index);
            return index;
        }


    public static int binarySearch(int[] elementsArray, int element) {
        int left = 0;   // Kennzeichnet das erste Element
        int right = elementsArray.length - 1;   // Kennzeichnet die gesamte Laenge - 1

        while (left <= right) {
            System.out.println("Left: " + left);
            System.out.println("Right: " + right);
            int mid = (left + right) / 2;   // Bildet das Center für den Start

            System.out.println("Mid: " + mid);
            System.out.println("ElementsArray[mid]: " + elementsArray[mid]);
            if (elementsArray[mid] == element) {
                return mid; // Element gefunden
            } else if (element < elementsArray[mid]) {
                right = mid - 1;  // rechts verkleinern
                System.out.println("New right: " + right);
            } else {
                left = mid + 1;   // links verschieben
                System.out.println("New Left: " + left);
            }
        }

        return -1; // Element nicht gefunden
    }


    public static void main(String[] args){
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int search = linearSearch(arr, 8);

            int[] arrayForLinearSearchLast = {1, 1, 1, 6, 8, 10, 10, 10};
            int lastIndexOfElement = linearSearchLast(arrayForLinearSearchLast, 10);
            System.out.println("Ergebnis von linearSearchLast: " + lastIndexOfElement);


            String allIndexesOfElement = linearSearchAll(arrayForLinearSearchLast, 10);


            int test = binarySearch(arr, 4);
            System.out.println("After completing the binarySearch, the element is in index: " + test);
            if (search == -1){
                System.out.println("Element is not in list!"); // sout + tab als shortcut
            }
            else{
                System.out.println("The first place of the element is in index: " + search);
            }
        }
    }

