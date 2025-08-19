package uebung03;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SearchAlgorithmsTest {

    @Test
    void linearSearchTest(){
        int[] arr1 = {2,42,5,67,87,4,32,1,8,9};
        assertEquals(2,SearchAlgorithms.linearSearch(arr1,5));
        int[] arr2 = {2,42,67,87,4,32,1,8,9};
        assertEquals(-1,SearchAlgorithms.linearSearch(arr2,5));
    }

    @Test
    void binarySearchTest(){
        int[] arr1 = {2,4,5,9,11,14,42,99,120,123};
        assertEquals(2,SearchAlgorithms.binarySearch(arr1,5));
        assertEquals(4,SearchAlgorithms.binarySearch(arr1,11));
        assertEquals(8,SearchAlgorithms.binarySearch(arr1,120));
        assertEquals(-1,SearchAlgorithms.binarySearch(arr1,100));
    }

    @Test
    void quadraticBinarySearchTest(){
        int[] arr1 = {2,4,5,9,11,14,42,99,120,123};
        assertEquals(2,SearchAlgorithms.quadraticBinarySearch(arr1,5));
        assertEquals(4,SearchAlgorithms.quadraticBinarySearch(arr1,11));
        assertEquals(8,SearchAlgorithms.quadraticBinarySearch(arr1,120));
        assertEquals(-1,SearchAlgorithms.quadraticBinarySearch(arr1,100));
        assertEquals(-1,SearchAlgorithms.quadraticBinarySearch(arr1,0));
        assertEquals(-1,SearchAlgorithms.quadraticBinarySearch(arr1,124));
    }

    @Test
    void fastSearchTest(){
        int[] arr1 = {2,4,5,9,11,14,42,99,120,123};
        assertEquals(2,SearchAlgorithms.fastSearch(arr1,5));
        assertEquals(4,SearchAlgorithms.fastSearch(arr1,11));
        assertEquals(8,SearchAlgorithms.fastSearch(arr1,120));
        assertEquals(-1,SearchAlgorithms.fastSearch(arr1,100));
        assertEquals(-1,SearchAlgorithms.fastSearch(arr1,0));
        assertEquals(-1,SearchAlgorithms.fastSearch(arr1,124));
        assertEquals(-1,SearchAlgorithms.fastSearch(arr1,3));
    }
}
