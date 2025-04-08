public class delete_Node_ByValue {
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

    // Method to append a node to the end
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

    // Method to delete the first node with the given value
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // If head needs to be deleted
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if (curr.data == value) {
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Value " + value + " not found in the list.");
    }

    // Method to print the list
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
        delete_Node_ByValue list = new delete_Node_ByValue();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);

        System.out.println("Original List:");
        list.printList(); // 10 -> 20 -> 30 -> 40 -> null

        list.deleteByValue(20);

        System.out.println("After deleting 20:");
        list.printList(); // 10 -> 30 -> 40 -> null

        list.deleteByValue(10);

        System.out.println("After deleting 10 (head):");
        list.printList(); // 30 -> 40 -> null

        list.deleteByValue(100); // not in list
    }
}
