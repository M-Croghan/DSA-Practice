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

public class SinglyLinkedList {

    public static class Node{
        private int data;
        private Node next;
        private Node(int data){
            this.data = data;
        }
    }

    Node head;

    public void append(int data){
        if (head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteValue(int data){
        if (head == null) return;
        if (head.data == data){
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next.next != null){
            if (current.next.data == data){
                current.next = current.next.next;
            }
            current = current.next;
        }
    }
}
