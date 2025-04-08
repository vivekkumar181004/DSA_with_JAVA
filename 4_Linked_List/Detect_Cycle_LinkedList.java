public class Detect_Cycle_LinkedList {
    Node head;

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to append nodes to the list
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

    // Method to create a cycle in list  for testing
    public void createCycle() {
    if (head == null) return;

    Node temp = head;
    Node last = null;
    Node third = null;

    int count = 1;
    while (temp.next != null) {
    if (count == 3) {
    third = temp;
    }
    temp = temp.next;
    count++;
    }

    last = temp; // last node
    last.next = third; // creating a cycle back to the third node
    }

    // Method to create a circular Linked list for testing
    public void createCircularList() {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
    }

    // Floyd’s Cycle Detection Algorithm
    public boolean hasCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Check if slow and fast meet
            if (slow == fast) {
                System.out.println("meeting node is : " + slow.data);
                return true; // cycle detected
            }
        }

        return false; // no cycle
    }

    // Main method to test
    public static void main(String[] args) {
        Detect_Cycle_LinkedList list = new Detect_Cycle_LinkedList();

        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        // Uncomment the next line to create a cycle in the list( use any one to create cycle)---------------------------
        list.createCycle();
        // list.createCircularList();

        // Detect if cycle exists
        boolean result = list.hasCycle();
        if (result) {
            System.out.println("Cycle detected in the linked list.");
        } else {
            System.out.println("No cycle in the linked list.");
        }
    }
}
