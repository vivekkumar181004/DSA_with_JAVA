public class Middle_LinkedList {
    Node head;

    // Node class definition
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to append a node to the end of the list
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

    // Method to find the middle node
    public void findMiddleNode() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node slow = head;
        Node fast = head;

        // Move slow by 1 and fast by 2 until fast reaches end
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle node of given linked list is: " + slow.data);
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
        Middle_LinkedList list = new Middle_LinkedList();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);
        // list.append(60); // Uncomment this line to test even number of nodes

        System.out.println("Linked List:");
        list.printList();

        list.findMiddleNode(); // Output will be 30 for odd, 40 for even
    }
}
