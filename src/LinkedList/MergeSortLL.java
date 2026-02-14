package LinkedList;

public class MergeSortLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(30);
        Node c = new Node(20);
        Node d = new Node(50);
        Node e = new Node(40);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        a = mergeSort(a);

        printList(a);  // 👈 This should work
    }

    static Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head2 = slow.next;
        slow.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(head2);

        return merge(left, right);
    }

    static Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node k = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                k.next = head1;
                head1 = head1.next;
            } else {
                k.next = head2;
                head2 = head2.next;
            }
            k = k.next;
        }

        if (head1 != null)
            k.next = head1;
        else
            k.next = head2;

        return dummy.next;
    }

    // 👇 MUST BE INSIDE Main class
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}