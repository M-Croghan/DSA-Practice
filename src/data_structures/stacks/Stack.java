package data_structures.stacks;// One-ended linear data structure which models a real world stack (maye a stack of plates).
// LIFO - Last In, First Out
// Two major operations: .push() - adds to the top stack || .pop() - removes first item on top of the stack.

/* Interesting places where Stacks are found:
 * - Undo mechanisms in text-editors.
 * - Compiler Syntax Checking (Braces & Brackets <-- A common technical problem, "Valid brackets")
 * - Supports recursion by keeping track of function calls
 *
 * MAIN OPERATIONS:
 * - POP -> Removes top element on the stack
 * - PUSH -> Adds an element to the top of the stack
 * - PEEK -> Examines the top element in the stack */

public class Stack {

    private static class Node {
        private int data;
        private Node next;
        private Node(int data){
            this.data = data;
        }
    }

    private Node top; // Indicates the top of the stack

    public boolean isEmpty(){
        return top == null; // If top is null, the stack is empty
    }

    public int peek(){
        return top.data;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if (top != null){
            newNode.next = top;
            top = newNode;
        }
        top = newNode;
    }

    public int pop(){
        try {
            int popped = top.data;
            top = top.next;
            return popped;
        }
        catch (NullPointerException e){
            e.printStackTrace();
            return -1;
        }
    }

}
