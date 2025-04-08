public class reverseList_Iteratively {
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
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Iterative method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next; // store next node
            curr.next = prev; // reverse the link
            prev = curr; // move prev one step forward
            curr = next; // move curr one step forward
        }

        head = prev; // Update head to the new front
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
        reverseList_Iteratively list = new reverseList_Iteratively();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        System.out.println("Original List:");
        list.printList(); // 10 -> 20 -> 30 -> 40  -> 50-> null

        list.reverse();

        System.out.println("Reversed List:");
        list.printList(); // 50 ->  40 -> 30 -> 20 -> 10 -> null
    }
}
