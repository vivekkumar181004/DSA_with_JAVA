import java.util.Scanner;
import java.util.Stack;

public class valid_Parenthesis {

    public static boolean isValid(String str) {

        char[] chars = str.toCharArray();

        Stack<Character> stack1 = new Stack<>();

        // forEach loop
        for (char ch : chars) {
            // 1. if the element contains open brackets, push it to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack1.push(ch);
                continue;
            } else {
                // in case if string is --- " ])}}]" contains only closed brackets (no open bracket - not valid parenthesis)
                if (stack1.isEmpty()) {
                    return false;
                }

                char top = stack1.pop();
                if ((top == '(' && ch != ')') ||
                        (top == '{' && ch != '}') ||
                        (top == '[' && ch != ']')) {
                    return false;
                }
            }
        }

        // is the stack is empty or not
        return stack1.isEmpty(); // should be empty if all matched
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string parenthesis : ");
        String str = sc.nextLine();
        System.out.println("Is the given string valid?  " + isValid(str));
        sc.close();

    }
}
