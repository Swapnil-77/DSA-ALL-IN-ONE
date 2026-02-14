package LinkedList;

public class IntersectionOfTwoLL {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Solution class
    static class Solution {

        public ListNode getIntersectionNode(ListNode head1, ListNode head2) {

            int len1 = 0;
            ListNode temp1 = head1;
            while (temp1 != null) {
                temp1 = temp1.next;
                len1++;
            }

            int len2 = 0;
            ListNode temp2 = head2;
            while (temp2 != null) {
                temp2 = temp2.next;
                len2++;
            }

            temp1 = head1;
            temp2 = head2;

            if (len1 > len2) {
                for (int i = 1; i <= len1 - len2; i++) {
                    temp1 = temp1.next;
                }
            } else {
                for (int i = 1; i <= len2 - len1; i++) {
                    temp2 = temp2.next;
                }
            }

            while (temp1 != temp2) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }

            return temp1;
        }
    }

    public static void main(String[] args) {

        // Create common part
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        // First list: 3 → 7 → 8 → 10
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(7);
        head1.next.next = common;

        // Second list: 99 → 1 → 8 → 10
        ListNode head2 = new ListNode(99);
        head2.next = new ListNode(1);
        head2.next.next = common;

        Solution sol = new Solution();
        ListNode intersection = sol.getIntersectionNode(head1, head2);

        if (intersection != null) {
            System.out.println("Intersection at node: " + intersection.val);
        } else {
            System.out.println("No Intersection");
        }
    }
}
