package LinkedList;

public class SwappingNodesInLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        SwappingNodesInLinkedList obj = new SwappingNodesInLinkedList();
        System.out.println(obj.swapNodes(a,2).val);
    }
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1;i<=k;i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        fast = head;
        for(int i=1;i<=k-1;i++){
            fast = fast.next;
        }
        int temp = fast.val;
        fast.val = slow.val;
        slow.val = temp;
        return head;
    }
}
