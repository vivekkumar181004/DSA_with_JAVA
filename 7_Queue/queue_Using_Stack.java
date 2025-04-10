import java.util.Stack;

public class queue_Using_Stack {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Enqueue (Add data into queue)
    // time complexity - O(1)
    public void enQueue(int data) {
        stack1.push(data);
    }

    // Dequeue (Remove data from queue) - FIFO
    public int deQueue() {
        int element;
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("queue is Empty");
            System.exit(0);
        }

        // push all elementfs from stack1 to stack2
        // time complexity - O(n)
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                element = stack1.pop();
                stack2.push(element);
            }
        }

        // pop the top elemet from stack2
        // FIFO - first in first out
        element = stack2.pop();
        return element;

    }

    // Queue size
    public int size() {
        return stack1.size() + stack2.size();
    }

    public static void main(String[] args) {
        queue_Using_Stack q = new queue_Using_Stack();

        // Function calling for insertion in queue
        q.enQueue(6);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);

        //  function calling for deletion of element from the queue
        System.out.println("deleted element is : "+q.deQueue());
        System.out.println("deleted element is : "+q.deQueue()); 

        // function to print size of queue
        System.out.println("deleted element is : "+q.size());

    }
}
