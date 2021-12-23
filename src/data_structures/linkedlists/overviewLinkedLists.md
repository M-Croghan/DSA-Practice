# OVERVIEW OF LINKED LISTS
## INTRODUCTION
A Linked list is a sequential list of nodes, each of which holds two pieces of information:  
- A Value: data stored in the node.
- Pointer(s): A reference to the next node in the list.
  - A doubly-linked list maintains 2 pointers, one to the previous node & the next node.

Linked Lists are null terminated, which means that the _next pointer_ of the last name will be set to _null_, 
indicating the end of the list.  

It is important to highlight that pointers are merely a reference to a location in memory. When a value is created
and a variable is assigned to it, any other variable assigned to the same value, will in fact be pointing to the same
address in memory. When a reference to a value is removed, and an object no longer has any references pointing at it, 
the JVM will handle garbage collection and deallocate that memory space.

### Use Cases
- Most common:
  - Lists
    - Also, great for circular lists.
  - Stacks
  - Queues
- More advanced: 
  - Hash table chaining
  - Adjacency lists.

### Terminology
* _Head_: 1st node in a linked list
* _Tail_: Last node in a linked list
* _Node_: Object containing data & pointer(s) to another node.
* _Pointer_: Reference to another node.
* SINGLY LINKED ----> points to the next node. 
  * Less memory, simple implementation.
    * ***BUT***: cannot easily access previous nodes.
* DOUBLY LINKED <---> holds a reference to the previous and next node. 
  * Can traverse both directions.
    * ***BUT***: x2 more memory.

### Pros / Cons
* ***Singly Listed Lists***
  * PROS
    * Simple implementation
    * Memory efficient
  * CONS
    * Cannot iterate in reverse
    * If you lose reference to the head node, you may lose the list completely.

* ***Doubly Linked Lists***
  * PROS
    * Easily traverse the list forwards & backwards
  * CONS
    * More complex implementation
    * Requires more memory!


![img_2.png](img_2.png)


### Time / Space Complexity
|               | SINGLY LINKED | DOUBLY LINKED |
|---------------|---------------|---------------|
|SEARCH         |      O(n)     |     O(n)      |
| Insert @ Head |       O(1)    |      O(1)     |
| Insert @ Tail |      O(1)    |      O(1)      |
| Remove @ Head |       O(1)    |      O(1)      |
| Remove @ Tail |       O(n)    |     O(1)      |
| Remove @ Middle|      O(n)    |      O(n)      |

### RESOURCES
[Top 20 Linked List Interview Questions](https://www.geeksforgeeks.org/top-20-linked-list-interview-question/)  
Includes:
- Implementing a linked list.
- Adding / removing nodes from a linked list.
- Traversing a linked list.

[Visualizing Linked Lists](https://visualgo.net/bn/list?slide=1)