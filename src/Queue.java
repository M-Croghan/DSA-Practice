import java.util.Iterator;
import java.util.LinkedList;

// One of the most useful data structures.
// FIFO -> First In, First Out
// Enqueue --> |||||||||   -> | --> Dequeue
// Models real world queues! Waiting in line!
// Often used in server management (first come / first serve)
// BFS graph traversal
public class Queue <T> implements Iterable <T>{

    private LinkedList<T> list = new LinkedList<>();

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
