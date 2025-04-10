import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Implement {
    public static void main (String[] args){

        Deque<Integer> deque=  new ArrayDeque<>();

        deque.addFirst(5);
        deque.addFirst(7);
        deque.addFirst(9);
        deque.addFirst(11);
        System.out.println("deque output looks like : "+ deque);
        
        deque.addLast(56);
        deque.addLast(66);
        deque.addLast(76);
        System.out.println("Now deque output looks like : "+ deque);
        
        deque.removeLast();
        deque.removeFirst();
        System.out.println("after deleting element from first and last deque output looks like : "+ deque);
    }
}
