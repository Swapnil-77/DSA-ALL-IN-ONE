package LinkedList;

public class RemoveAllOccurFromSortedLinkedList {
        static class ListNode {
            int val;
            ListNode next;

            ListNode(int val) {
                this.val = val;
            }
        }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(3);
        ListNode e = new ListNode(4);
        ListNode f = new ListNode(4);
        ListNode g = new ListNode(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        RemoveAllOccurFromSortedLinkedList obj = new RemoveAllOccurFromSortedLinkedList();
        ListNode head = obj.deleteDuplicates(a);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        ListNode i = head; // i will travel LL
        while (i != null) {
            if (i.next == null || i.val != i.next.val) {
                t.next = i;
                t = i;
                i = i.next;
            } else { // i.val == i.next.val
                ListNode j = i.next;
                while (j != null && j.val == i.val) {
                    j = j.next;
                }
                i = j;
            }
        }
        t.next = i;
        return dummy.next;
    }
}
