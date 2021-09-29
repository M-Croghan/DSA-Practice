public class LinkedLists {
    // Linked list is a sequential list of nodes which hold data, which point to other nodes.
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


}
