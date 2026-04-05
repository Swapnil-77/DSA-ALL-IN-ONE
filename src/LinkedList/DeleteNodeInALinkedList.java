package LinkedList;

public class DeleteNodeInALinkedList {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(9);

        DeleteNodeInALinkedList obj = new DeleteNodeInALinkedList();

        System.out.print("Before: ");
        printLists(head);

        obj.deleteNode(head.next); // delete 5

        System.out.print("After: ");
        printLists(head);
    }

    /* 🔹 Print Linked List */
    public static void printLists(ListNode head){
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    /* 🔥 In-place deletion (O(1), no traversal needed) */
    public void deleteNode(ListNode target) {
        target.val = target.next.val;
        target.next = target.next.next;
    }
}