public class Insertion_After_AnyNode {
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

    // Method to insert at the end of node of list
    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);

        // If the linked list is empty
        if (head == null) {
            // head=new Node(newData);
            head = newNode;
            return;
        }

        // Traverse to the end of the list
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    // Method to insert a node after any Node
    public void insertAfterAnyNode(Node pre_Node, int data) {
        if (pre_Node == null) {
            System.out.println("previous node cannot be null. ");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = pre_Node.next;
        pre_Node.next = newNode;
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
        Insertion_After_AnyNode list = new Insertion_After_AnyNode();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println();
        list.printList();

        System.out.println();
        Node secondNode = list.head.next;   // node with data 20 ( we can do this with also)-----------
        list.insertAfterAnyNode(secondNode, 25);
        list.insertAfterAnyNode(list.head, 15);
        list.insertAfterAnyNode(list.head.next.next, 1555);

        list.printList(); // Output: 10 -> 15 -> 20 -> 1555 ->  25 -> 30 -> null
        System.out.println();
    }
}
