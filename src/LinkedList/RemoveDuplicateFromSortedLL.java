package LinkedList;

public class RemoveDuplicateFromSortedLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(20);
        Node d = new Node(30);
        Node e = new Node(30);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        RemoveDuplicateFromSortedLL obj = new RemoveDuplicateFromSortedLL();
        obj.removeDuplicates(a);
    }

    Node removeDuplicates(Node head) {
        Node i = head;
        Node j = head;
        while(j != null){
            if(i.data == j.data) j = j.next;
            else{
                i.next = j;
                i = j;
            }
        }
        i.next = j;
        return head;
    }
}
