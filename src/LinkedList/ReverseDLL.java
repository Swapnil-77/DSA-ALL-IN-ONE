package LinkedList;

public class ReverseDLL {

    static class DLLNode {
        int val;
        DLLNode prev;
        DLLNode next;

        DLLNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        // create DLL: 1 <-> 2 <-> 3
        DLLNode head = new DLLNode(1);
        head.next = new DLLNode(2);
        head.next.prev = head;
        head.next.next = new DLLNode(3);
        head.next.next.prev = head.next;

        System.out.print("Before: ");
        printList(head);

        DLLNode reversedHead = reverseDLL(head);

        System.out.print("After: ");
        printList(reversedHead);
    }

    // 🔥 Reverse Doubly Linked List (O(n), O(1))
    public static DLLNode reverseDLL(DLLNode head) {
        if (head == null || head.next == null) return head;

        DLLNode curr = head;
        DLLNode temp = null;

        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            curr = curr.prev;
        }

        return temp.prev;
    }

    //  Print DLL
    public static void printList(DLLNode head) {
        while (head != null) {
            System.out.print(head.val + " <-> ");
            head = head.next;
        }
        System.out.println("null");
    }
    // public DLLNode reverseDLL(DLLNode head) {
    //     DLLNode pre = null;
    //     DLLNode curr = head;
    //     DLLNode fwd = null;
    //     while(curr!=null){
    //         fwd = curr.next;
    //         curr.next = pre;
    //         curr.prev = fwd; // added line
    //         pre = curr;
    //         curr = fwd;
    //     }
    //     return pre;
    // }
}