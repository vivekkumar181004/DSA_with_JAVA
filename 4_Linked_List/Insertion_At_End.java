// package 4_Linked_List;

public class Insertion_At_End {
    Node head;

    // Inner Node class
    class Node {
        int data;
        Node next;

        // node constructor
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert at the end
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

    // Method to print the linked list
    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        // creating object of the class we have created
        Insertion_At_End list = new Insertion_At_End();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        System.out.println();
        System.out.println("Before insertion of 40");
        list.printLinkedList();
        System.out.println();

        list.insertAtEnd(40);
        System.out.println("After insertion of 40");
        list.printLinkedList();
        System.out.println();
    }
}
