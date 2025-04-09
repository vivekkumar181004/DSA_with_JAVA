import java.util.Stack;

public class stack_class_Operation {

    public static void main(String[] args) {
        // define stack class
        Stack<Integer> stack1 = new Stack<>();

        // push elements inside the stack
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(9);

        // print the topmost element in the stack
        System.out.println("the topmost element in the stack before deletion is : " + stack1.peek());

        // delete the topmost element from the stack
        stack1.pop();

        // print the topmost element in the stack
        System.out.println("the topmost element in the stack after deletion is : " + stack1.peek());

        // search an element in stack (1-based from top)
        // search function return -1 if element is not present in the stack
        System.out.println("Position of element 4 : " + stack1.search(4));
        System.out.println("Position of element 10 : " + stack1.search(10));

        // checks whether the stack is empty or not
        // empty function returns the boolean value (true/false)
        System.out.println("Is stack empty? " + stack1.isEmpty()); // false

        // returns the no. of elements in stack
        System.out.println("Size of stack  : " + stack1.size()); // 3

        // removes all elements from the stack
        stack1.clear();
        System.out.println("Is stack empty after using clear function? " + stack1.isEmpty()); // ture

    }

}
