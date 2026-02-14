package LinkedList;

public class MergeTwoSortedLL {
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
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = c;
        c.next = e;

        b.next = d;

        MergeTwoSortedLL obj = new MergeTwoSortedLL();
        Node head = obj.sortedMerge(a, b);
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    Node sortedMerge(Node head1, Node head2) {
        Node i = head1;
        Node j = head2;
        Node dummy = new Node(-1);
        Node k = dummy;
        while(i!=null && j!=null){
            if(i.data <= j.data){
                k.next = i;
                i = i.next;
            }
            else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i==null) k.next = j;
        else k.next = i;
        return dummy.next;
    }
}
