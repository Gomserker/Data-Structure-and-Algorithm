package Queue;

import LinkedList.MyLinkedList;
import LinkedList.MyListNode;

interface Queue{
    public void enQueue(String data);
    public String deQueue();
    public void printQueue();
}

public class MyLinkedQueue extends MyLinkedList implements Queue{

    MyListNode front;
    MyListNode rear;
    
    @Override
    public void enQueue(String data) {
        MyListNode newNode;
        if(isEmpty()) { //queue의 처음 항목일때, isEmpty가 True라면 비어있다는 뜻이니까.
           newNode = addElement(data);
           front = newNode;
           rear = newNode;
        } else {
            newNode = addElement(data);
            rear = newNode;
        }System.out.println(newNode.getData() + " added");
    }

    @Override
    public String deQueue() {
        
        if(isEmpty()) {
            return null;
        }
        String data = front.getData();
        front = front.next;
        
        if(front == null) {
            rear = null;
        }
        return data;
    }

    @Override
    public void printQueue() {
        
        printAll();
    }

}
