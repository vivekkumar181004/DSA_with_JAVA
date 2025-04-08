public class reverseList_Recursively {
    Node head;

    // Inner Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Append node to the end of the list
    public void append(int data) {
        Node newNode = new Node(data); // Create a new node with given data

        // If list is empty, make newNode the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the end of the list
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
         // Add newNode at the end
        temp.next = newNode;
    }

    // Recursive method to reverse the linked list
    public void reverseRecursion(Node curr, Node prev) {
        // last node of a linked list
        if (curr.next == null) {
            head = curr;
            curr.next = prev;
            return;
        }

        Node next = curr.next;   // Store next node
        curr.next = prev;    // Reverse the current node's link
        // recursive function call--------------------
        reverseRecursion(next, curr); // reverseRecursion ( curr pointer , prev pointer );
    }

    // Print the list
    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        reverseList_Recursively list = new reverseList_Recursively();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        System.out.println("Original List:");
        list.printList(); // 10 -> 20 -> 30 -> 40 -> 50-> null

        // Call the recursive reverse function with head and null
        list.reverseRecursion(list.head, null);

        System.out.println("Reversed List:");
        list.printList(); // 50 -> 40 -> 30 -> 20 -> 10 -> null
    }
}
