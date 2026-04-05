package LinkedList;

public class FlattenADoublyLL {
        class Node {
            public int val;
            public Node prev;
            public Node next;
            public Node child;
        }

    public static void main(String[] args) {
         FlattenADoublyLL obj = new FlattenADoublyLL();
         Node head = obj.new Node();
         head.val = 1;
         head.next = obj.new Node();
         head.next.val = 2;
         head.next.prev = head;
         head.next.next = obj.new Node();
         head.next.next.val = 3;
         head.next.next.prev = head.next;
         head.child = obj.new Node();
         head.child.val = 4;
         head.child.next = obj.new Node();
         head.child.next.val = 5;
         head.child.next.prev = head.child;
         Node flattenedHead = obj.flatten(head);
    }
    public Node flatten(Node head) {
        if(head==null) return head;
        Node curr = head;
        while(curr!=null){
            if(curr.child==null) curr = curr.next;
            else{
                Node fwd = curr.next;
                Node c = flatten(curr.child);
                curr.child = null;
                curr.next = c;
                c.prev = curr;
                Node temp = c;
                while(temp.next!=null) temp = temp.next;
                temp.next = fwd;
                if(fwd!=null) fwd.prev = temp;
                curr = fwd;
            }
        }
        return head;
    }
}
