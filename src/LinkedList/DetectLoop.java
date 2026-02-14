package LinkedList;

public class DetectLoop {
    static class Node {
        int val;
         DetectLoop.Node next;

        Node(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = c;

        System.out.println(detectLoop(a));
    }
    public static boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) return true;
        }
        return false;
    }
    // public static boolean detectLoop(Node head) {
    //     Node slow = head;
    //     Node fast = head;
    //     while(fast!=null && fast.next!=null && fast.next.next!=null){
    //         slow = slow.next;
    //         fast = fast.next.next.next;
    //         if(fast == slow) return true;
    //     }
    //     return false;
    // }
}

