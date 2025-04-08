public class Insertion_At_Beginning {
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

    // Method to insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Method to print the linked list
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
        Insertion_At_Beginning list = new Insertion_At_Beginning();

        list.insertAtBeginning(30);
        list.insertAtBeginning(20);
        list.insertAtBeginning(10);
        
        System.out.println();
        list.printList(); // Output: 10 -> 20 -> 30 -> null

        System.out.println();
        list.insertAtBeginning(880);
        list.printList(); // Output: 880 -> 10 -> 20 -> 30 -> null
        System.out.println();
    }
}
