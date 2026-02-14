package LinkedList;

public class PartitionListLeetcode {
        static class ListNode {
            int val;
            ListNode next;

            ListNode(int val) {
                this.val = val;
            }
        }

        public static void main(String[] args) {
            ListNode a = new ListNode(1);
            ListNode b = new ListNode(4);
            ListNode c = new ListNode(3);
            ListNode d = new ListNode(2);
            ListNode e = new ListNode(5);
            ListNode f = new ListNode(2);

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;

            PartitionListLeetcode obj = new PartitionListLeetcode();
            System.out.println(obj.partition(a, 3));
        }

    public ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(45);
        ListNode d2 = new ListNode(18);
        ListNode t1 = d1; // smaller
        ListNode t2 = d2; // larger
        ListNode t = head;
        while(t != null){
            if(t.val < x){
                t1.next = t;
                t1 = t1.next;
            }
            else{
                t2.next = t;
                t2 = t2.next;
            }
            t = t.next;
        }
        t1.next = d2.next;
        t2.next = null;
        return d1.next;
    }
}
