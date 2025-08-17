package AO1;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestLinkedList{
    @Test
    public void addTest(){
        LinkedList list = new LinkedList(); // Erstellen eines neuen Objekts der LinkedList
        list.add(10);
        list.add(20);
        list.add(30);

        assertEquals(3, list.size());          // Größe überprüfen
        assertEquals("10,20,30", list.toString());  // Reihenfolge überprüfen
    }

    @Test
    public void removeTest(){
        LinkedList list = new LinkedList(); // Erstellen eines neuen Objekts der LinkedList
        list.add(10);
        list.add(20);
        list.add(30);

        assertEquals(3, list.size());          // Größe überprüfen
        assertEquals("10,20,30", list.toString());  // Reihenfolge überprüfen

        list.remove(20);

        assertEquals(2, list.size());
        assertEquals("10,30", list.toString());

        list.remove(10);
        assertEquals(1, list.size());
        assertEquals("30", list.toString());

        list.remove(30);
        assertEquals(0, list.size());
        assertEquals("", list.toString());
    }

    @Test
    public void containsTest(){
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        assertTrue(list.contains(20));
        assertFalse(list.contains(0));
    }


    @Test
    public void elementsTest(){
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        int[] expected = {10, 20, 30};
        int[] actual = list.elements();

        assertArrayEquals(expected, actual); // vergleicht beide Arrays

        LinkedList emptyList = new LinkedList();
        int[] expectedList = {};
        assertArrayEquals(expectedList, emptyList.elements());
    }

    @Test
    public void addHead(){
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        list.addHead(50);

        assertEquals(4, list.size());
        assertEquals("50,10,20,30", list.toString());
    }


    @Test
    public void removeHead(){
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        list.removeHead();

        assertEquals(2, list.size());
        assertEquals("20,30", list.toString());
    }
}