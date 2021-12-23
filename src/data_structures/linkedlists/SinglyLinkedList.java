package data_structures.linkedlists;// Linked list is a sequential list of nodes which hold data, which point to other nodes.
// Most commonly used: lists, stacks, queues. Also, great for circular lists.
// More advanced: Hash table chaining & adjacency lists.

// *** TERMINOLOGY ***
// Head: 1st node in a linked list
// Tail: Last node in a linked list
// Node: Object containing data & pointer(s) to another node.
// Pointer: Reference to another node.
// SINGLY LINKED ----> points to the next node. [Less memory, simple implementation. BUT: cannot easily access previous nodes]
// DOUBLY LINKED <---> holds a reference to the previous and next node. [Can traverse both directions BUT: x2 more memory]

// ** COMPLEXITY **
//                  SINGLY LINKED                DOUBLY LINKED
// SEARCH               O(n)                        O(n)
// Insert @ Head        O(1)                        O(1)
// Insert @ Tail        O(1)                        O(1)
// Remove @ Head        O(1)                        O(1)
// Remove @ Tail        O(n)                        O(1)
// Remove @ Middle      O(n)                        O(n)

import java.util.Arrays;

public class SinglyLinkedList {

    private Node head;
    private Node tail;
    private int length = 0;

    public int getLength() {
        return length;
    }

    private static class Node{
        private int value;
        private Node next;

        private Node(int value){
            this.value = value;
            this.next = null;
        }
    }

    public SinglyLinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length++;
    }

    public void append(int value){
        Node addNode = new Node(value);
        this.tail.next = addNode;
        this.tail = addNode;
        this.length++;
    }

    public void prepend(int value){
        Node addNode = new Node(value);
        Node previousHead = this.head;
        this.head = addNode;
        this.head.next = previousHead;
        length++;
    }

    public void insert(int index, int value){
        Node insertNode = new Node(value);
        int counter = 0;
        Node currentNode = this.head;
        while (counter < index - 1){
            currentNode = currentNode.next;
            counter++;
        }
        Node nextNode = currentNode.next;
        currentNode.next = insertNode;
        insertNode.next = nextNode;
        length++;
    }

    public void remove(int index){
        if (index == 0){
            this.head = this.head.next;
            length--;
        }
        else {
            int counter = 0;
            Node currentNode = this.head;
            while (counter < index - 1){
                currentNode = currentNode.next;
                counter++;
            }
            Node beforeNode = currentNode;
            beforeNode.next = beforeNode.next.next;
            length--;
        }

    }

    public void printLinkedList(){
        int[] arr = new int[this.length];
        int counter = 0;
        Node currentNode = this.head;
        while (counter < this.length){
            arr[counter] = currentNode.value;
            counter++;
            currentNode = currentNode.next;
        }
        System.out.println(Arrays.toString(arr));
    }

}
