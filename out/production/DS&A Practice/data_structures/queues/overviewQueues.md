# OVERVIEW: QUEUES
## INTRODUCTION
Queues are FIFO (First In, First Out) data structures and can be found in how printers queue jobs to CPU scheduling tasks.

Queues share many similarities with stacks, in that they have similar and limited functionality:
- Access O(1)
- Insert O(1)
- Delete O(1)
- Check Empty O(1)  
  Additionally, Queues are also often implemented via an array / linked list.

### Priority Queues
In a priority queue, every item maintains a priority which determines that items turn to exit the queue.
- High priority items dequeue before low priority items.
  - If items share the same priority, they are served in the order in which they queued.  

A real world example of a priority queue is boarding an airplane. All passengers will eventually board, but
first class / priority passengers are permitted to board first. In the context of technology, the CPU schedules tasks
based on a tasks priority. In dealing with limited resources, it doesn't make sense to serve a non-essential task before 
one that may play an important role in an applications operation.

### Double Ended Queue (Deque)
Double ended queues are often implemented via doubly linked lists or dynamic arrays and change the manner in which items inside
exist the queue. They are often involved in task-scheduling algorithms. They can be thought of as waiting in a long line at a grocery store.
A cashier in the next row, opens her lane and allows customers waiting to check out in the long line, to move over to her row and pay for their groceries.
### RESOURCES
[Queue Interview Questions](https://www.geeksforgeeks.org/queue-data-structure/)  
[Priority Queues](https://www.geeksforgeeks.org/priority-queue-set-1-introduction/)  
[Array Implementation Visualization](https://www.cs.usfca.edu/~galles/visualization/QueueArray.html)  
[Linked List Implementation Visualization](https://www.cs.usfca.edu/~galles/visualization/QueueLL.html)  
[]()