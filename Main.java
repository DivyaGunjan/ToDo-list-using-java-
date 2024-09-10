import java.util.*;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Node node1 = new Node(11);
        Node node2 = new Node(18);
        Node node3 = new Node(24);

        // Linking the nodes
        node1.next = node2;
        node2.next = node3;

        // Insert a new node with data 15 at index 1 (between node1 and node2)
        int newData = 15;
        int index = 1;
        insertAtIndex(node1, newData, index);

        // Optional: Printing the list to verify
        Node current = node1;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void insertAtIndex(Node head, int data, int index) {
        Node newNode = new Node(data);
        Node current = head;

        // If inserting at the head (index 0), handle separately
        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse to the node just before the target index
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.next;
        }

        // If the current node is not null, insert the new node
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        } else {
            // If index is out of bounds, print an error message
            System.out.println("Index out of bounds");
        }
    }
}
