package AO1;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestMyQueue{

    @Test
    public void enqueueTest(){
        MyQueue queue = new MyQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        int[] expected = {10, 20, 30};
        int[] actual = queue.elements();

        assertEquals(3, queue.size());
        assertArrayEquals(expected, actual);

        queue.enqueue(40);
        int[] newExpected = {10, 20, 30, 40};
        int[] newActual = queue.elements();

        assertEquals(4, queue.size());
        assertArrayEquals(newExpected, newActual);
    }


    @Test
    public void dequeueTest(){
        MyQueue queue = new MyQueue();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        assertEquals(3, queue.size());

        queue.dequeue();
        int[] expected = {20, 30};
        int[] actual = queue.elements();

        assertEquals(2, queue.size());
        assertArrayEquals(expected, actual);
    }

}