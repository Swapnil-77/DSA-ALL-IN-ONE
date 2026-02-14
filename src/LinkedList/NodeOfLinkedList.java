package LinkedList;

public class NodeOfLinkedList {

    // Apna Node class banayenge
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // 10 -> 20 -> 30 -> 40 -> 50

        Node a = new Node(10); // head
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        // Linking
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(e.val);                     // 50
        System.out.println(a.next.next.next.val);     // 40
        System.out.println(c);                        // address print hoga
        System.out.println(b.next);                   // address print hoga
        System.out.println(a.next.next);              // address print hoga
    }
}
