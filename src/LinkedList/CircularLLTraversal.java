package LinkedList;

public class CircularLLTraversal {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Your method
    void printList(Node head) {
        if (head == null) return;

        Node temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ");
    }

    public static void main(String[] args) {

        CircularLLTraversal list = new CircularLLTraversal();

        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);

        // Making circular connections
        a.next = b;
        b.next = c;
        c.next = a;   // important for circular

        list.printList(a);
    }
}
