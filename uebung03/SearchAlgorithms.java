package uebung03;

import java.util.Arrays;

public class SearchAlgorithms {

    public static int linearSearch(int[] array, int element){
        int index = -1;

        for(int currentElement = 0; currentElement < array.length; currentElement++){
            if (array[currentElement] == element){
                index = currentElement;
                return index;
            }
        }
        return index;
    }


    public static int binarySearch(int[] array, int element){
        int left = 0;
        int right = array.length - 1;

        while(left <= right){
            int center = (left + right) / 2;
            if(array[center] == element){
                return center;
            }
            else if(element > array[center]){
                left = center + 1;
            }
            else{
                right = center - 1;
            }
        }
        return -1; // Element not found
    }


    // Warum heißt das Ding "quadratische binärsuche", wenn es mehr mit Interpolationssuche zu tun hat????
    public static int quadraticBinarySearch(int[] array, int element) {
        int left = 0;
        int right = array.length - 1;
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Right: " + right);
        while (left <= right) {
            if (left == right) {
                return array[left] == element ? left : -1;
            }

            int start = (int)((long) left + (long) (right - left) * (long) (element - array[left]) / (long) (array[right] - array[left]));

            if (start < 0 || start >= array.length) {
                return -1;
            }

            if (array[start] == element) {
                return start;
            }

            int jump = (int) Math.sqrt(right - left + 1);

            if (element < array[start]) {  // unterer Teil
                do {
                    start -= jump;
                } while (start >= 0 && element < array[start]);

                if (start < 0) start = 0;
                if (element >= array[start]) {
                    right = start + jump - 1;
                    left = start;
                } else {
                    return -1;
                }
            } else {  // oberer Teil
                do {
                    start += jump;
                } while (start < array.length && element > array[start]);

                if (start >= array.length) start = array.length - 1;
                if (element <= array[start]) {
                    left = start - jump + 1;
                    right = start;
                } else {
                    return -1;
                }
            }
        }
        return -1;
    }

    public static int fastSearch(int[] array, int element) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int center = (left + right) / 2;
            if (element == array[center]) {
                return center;
            }

            int start = (int)((long) left + (long) (right - left) * (long) (element - array[left]) / (long) (array[right] - array[left]));
            if (start < 0 || start >= array.length) {
                return -1;
            }

            if (element == array[start]) {
                return start;
            }

            if (center > start) { // swap center und start
                int t = center;
                center = start;
                start = t;
            }

            if (element < array[center]) {
                right = center - 1; // links
            } else if (element < array[start]) {
                left = center + 1; // Mitte
                right = start - 1;
            } else {
                left = start + 1; // rechts
            }
        }
        return -1;
    }



    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int resultLinearSearch = linearSearch(arr, 8);
        System.out.println("Result of linear search: " + resultLinearSearch);

        int[] arr1 = {2,4,5,9,11,14,42,99,120,123, 200, 230, 300};
        int resultBinarySearch = binarySearch(arr1, 5);
        System.out.println("Result of binary search: " + resultBinarySearch);

        int test = quadraticBinarySearch(arr1, 42);

    }
}
