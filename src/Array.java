/* Arrays are one of the most basic data structures. They are a fundamental building blocck for
 * many other data structures. They're indexable from range [0, n-1]. Specifically in Java,
 * they're fixed / not dynamic, meaning that once they're created, they'll be fixed to the given size.
 * Arrays are stored as a contiguous block of memory and every element occupies the same amount of space in memory.
 * They offer fast retrieval (Constant Time - O(1)) provided you know the index of the element you need.
 * Insertion / Search / Deletion all maintain a time-complexity of O(n). */


public abstract class Array {


    int[] anArray = new int[3]; // This creates an array of a fixed size of 3.
    // anArray[0] = 22;  <-- This will add the integer 22 to the 0th / first index in the array.

    int[] anotherArray = {1,2,3}; // This creates an array and stores the values 1, 2, 3

    // new int[]{1,2,3}; <-- This creates an array in-line and may be used when creating an array to pass into a method.

    // Dynamic arrays differ in that they grow & shrink in size and allow for insert, append, & delete operations.
    // The ArrayList in Java is a prime example of dynamic array implementation.

}
