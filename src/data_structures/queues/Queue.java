package data_structures.queues;

// One of the most useful data structures.
// FIFO -> First In, First Out
// Enqueue --> |||||||||   -> | --> Dequeue
// Models real world queues! Waiting in line!
// Often used in server management (first come / first serve)
// BFS graph traversal
public class Queue {

    // Inner Node class to create nodes within the queue
    private static class Node {
        private int data; // Holds the data within the node of type int
        private Node next; // Pointer to the next node in the queue;

        private Node (int data){ // Node constructor
            this.data = data;
        }
    }

    private Node head; // Remove from the head
    private Node tail; // Where things will be added
    private int length;

    public Queue() {
        this.length = 0;
    }

    public Node getHead(){
        return head;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int peek(){
        try{
            return head.data;
        }
        catch (NullPointerException e){
            e.printStackTrace();
            return -1;
        }
    }

    public void add(int data){
        Node node = new Node(data);
        if (tail != null){
            tail.next = node;
        }
        tail = node;
        if (head == null){
            head = node;
        }
        length++;
    }

    public int  remove(){
        int data = head.data;
        head = head.next;

        if (head == null){
            tail = null;
        }
        length--;
        return data;
    }

    public int getLength(){
        return length;
    }

}
