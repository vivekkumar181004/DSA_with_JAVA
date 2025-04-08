public class delete_Node_ByPosition {
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
    
        // Append node at the end
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
    
        // Delete node by position (0-based index)
        public void deleteByPosition(int position) {
            // Linked List is Empty--------------
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
    
             // If head needs to be deleted
            if (position == 0) {
                head = head.next;
                return;
            }
    
            // deletion is not in the beginning of node-------------
            Node prev = head;
            Node curr = head.next;
            int index = 1;
    
            while (curr != null) {
                if (index == position) {
                    prev.next = curr.next;
                    return;
                }
                prev = curr;
                curr = curr.next;
                index++;
            }
    
            System.out.println("Position " + position + " is out of bounds.");
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
            delete_Node_ByPosition list = new delete_Node_ByPosition();
    
            list.append(10);
            list.append(20);
            list.append(30);
            list.append(40);
    
            System.out.println("Original List:");
            list.printList(); // 10 -> 20 -> 30 -> 40 -> null
    
            list.deleteByPosition(2); // deletes node with value 30
    
            System.out.println("After deleting position 2:");
            list.printList(); // 10 -> 20 -> 40 -> null
    
            list.deleteByPosition(0); // deletes head (10)
    
            System.out.println("After deleting position 0:");
            list.printList(); // 20 -> 40 -> null
    
            list.deleteByPosition(5); // out of bounds
        }
    }