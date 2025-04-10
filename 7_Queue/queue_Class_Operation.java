import java.util.LinkedList;
import java.util.Queue;

public class queue_Class_Operation {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue (Add elements)
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("Queue after enqueue: " + queue);

        // Dequeue (Remove front element)
        int removed = queue.remove();
        System.out.println("Removed element: " + removed);
        System.out.println("Queue after dequeue: " + queue);

        // Peek (Look at front element)
        int front = queue.peek();
        System.out.println("Front element (peek): " + front);

        // Size of the queue
        System.out.println("Queue size: " + queue.size());

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
