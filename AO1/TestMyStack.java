package AO1;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TestMyStack{
    @Test
    public void pushTest(){
        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);

        assertEquals(2, stack.size());
        assertEquals("20,10", stack.toString());
    }


    @Test
    public void popTest(){
        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        assertEquals(2, stack.size());

        stack.pop();
        assertEquals(1, stack.size());
        assertEquals("10", stack.toString());
    }
}