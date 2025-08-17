package AO1;

public class MyStack extends LinkedList{
    public void push(int element){
        addHead(element);
    }

    public int pop(){
        return removeHead();
    }
}
