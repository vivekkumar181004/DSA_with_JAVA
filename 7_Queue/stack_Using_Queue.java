import java.util.LinkedList;
import java.util.Queue;

public class stack_Using_Queue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push element onto stack
    // time complexity - O(n)
    public void add(int data) {
        // 1. move all the elements from q1 to q2
        while (!q1.isEmpty()) {
            int ele = q1.poll();
            q2.add(ele);
            // q2.add(q1.peek());
            // q1.poll();
        }

        // 2. push the new data to q1
        q1.add(data);

        // 3. move back all the elements from q2 to q1
        while (!q2.isEmpty()) {
            int ele = q2.poll();
            q1.add(ele);
        }
    }

    // Removes the element on top of the stack
      // time complexity - O(1)
    public int remove() {
        if (q1.isEmpty()) {
            System.out.println("Queue Underflow");
            System.exit(0);
        }

        int ele = q1.peek();
        q1.poll();
        return ele;
    }

    public static void main(String[] args) {
 stack_Using_Queue s = new stack_Using_Queue();

 // push all the elements in the stack
 s.add(2);
 s.add(5);
 s.add(9);
 s.add(12);
 s.add(56);
 s.add(67);

 // pop all the elements from the stack
 // LIFO - Last in first out
 System.out.println("deleted element from the stack is : "+ s.remove());
 System.out.println("deleted element from the stack is : "+ s.remove());
 System.out.println("deleted element from the stack is : "+ s.remove());


    }
}
