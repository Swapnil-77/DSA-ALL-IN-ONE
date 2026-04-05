package LinkedList;

public class SortList {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        head = mergeSort(head);

        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    //  Merge Sort on Linked List (O(n log n))
    static Node mergeSort(Node head) {
        if(head == null || head.next == null) return head;

        Node slow = head;
        Node fast = head;

        // find middle
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head2 = slow.next;
        slow.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(head2);

        return merge(left, right);
    }

    //  Merge two sorted lists
    static Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node k = dummy;

        Node i = head1;
        Node j = head2;

        while(i != null && j != null){
            if(i.data <= j.data){
                k.next = i;
                i = i.next;
            } else {
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }

        if(i != null) k.next = i;
        else k.next = j;

        return dummy.next;
    }
}
