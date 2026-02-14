package LinkedList;

public class KthFromEndOfLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(getKthFromLast(a, 2));
    }
    int getKthFromLast(Node head, int k) {
        Node slow = head;
        Node fast = head;
        // fast ko k steps aage le jaao
        for(int i=1;i<=k;i++){
            if(fast==null) return -1;
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}
