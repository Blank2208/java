package AO1;

public class MyQueue extends LinkedList{
    // Queue arbeitet in FIFO Prinzip
    public void enqueue(int element){
        add(element);   // Elemente werden am Ende eingefuegt (Head)
    }

    public int dequeue(){
        return removeHead(); // Aktueller Head wird entfernt
    }
}
