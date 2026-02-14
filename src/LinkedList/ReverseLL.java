package LinkedList;

public class ReverseLL {

    static class Node {
        int val;
        Node next;

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

        ReverseLL obj = new ReverseLL();
        Node head = obj.reverseList(a);
        while(head!=null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
    // Node reverseList(Node head) {
    //     if(head==null || head.next==null) return head;
    //     Node a = head.next;
    //     head.next = null;
    //     Node b = reverseList(a);
    //     a.next = head;
    //     return b;
    // }
    Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        Node fwd = null;
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    // Node reverseList(Node head) {
    //     Node temp = head;
    //     ArrayList<Node> arr = new ArrayList<>();
    //     while(temp!=null){
    //         arr.add(temp);
    //         temp = temp.next;
    //     }
    //     int n = arr.size();
    //     for(int i=n-1;i>=1;i--){
    //         arr.get(i).next = arr.get(i-1);
    //     }
    //     arr.get(0).next = null;
    //     return arr.get(n-1);
    // }
}
