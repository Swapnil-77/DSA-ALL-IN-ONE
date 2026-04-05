package LinkedList;

public class OddEvenLinkedListLeetcode {
        public static void main(String[] args) {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);
            OddEvenLinkedListLeetcode obj = new OddEvenLinkedListLeetcode();
            ListNode ans = obj.oddEvenList(head);
            while(ans!=null){
                System.out.print(ans.val + " ");
                ans = ans.next;
            }
        }
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(-1);
        ListNode even = new ListNode(-1);
        ListNode t1 = odd;
        ListNode t2 = even;
        ListNode t = head;
        while(t!=null){
            t1.next = t;
            t = t.next;
            t1 = t1.next;
            t2.next = t;
            if(t!=null) t = t.next;
            t2 = t2.next;
        }
        t1.next = even.next;
        return odd.next;
    }
}
