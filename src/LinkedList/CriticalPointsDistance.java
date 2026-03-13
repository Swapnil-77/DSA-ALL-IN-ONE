package LinkedList;

public class CriticalPointsDistance {

        // Definition for singly-linked list.
        static class ListNode {
            int val;
            ListNode next;

            ListNode(int val) {
                this.val = val;
                this.next = null;
            }
        }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(2);
        ListNode d = new ListNode(2);
        ListNode e = new ListNode(3);
        ListNode f = new ListNode(2);
        ListNode g = new ListNode(2);
        ListNode h = new ListNode(3);
        ListNode i = new ListNode(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;

        CriticalPointsDistance obj = new CriticalPointsDistance();
        int[] ans = obj.nodesBetweenCriticalPoints(a);
        System.out.println(ans[0] + " " + ans[1]);
    }
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1,-1};
        int idx = 1, firstIdx = -1, lastIdx = -1, minDist = Integer.MAX_VALUE;
        ListNode a = head;
        ListNode b = a.next;
        ListNode c = b.next;
        if(c==null) return ans; // 2 size ki LL

        while(c!=null){
            // check for critical point
            if((b.val > a.val && b.val > c.val) || (b.val < a.val && b.val < c.val)){
                if(firstIdx==-1) firstIdx = idx;
                if(lastIdx!=-1){
                    int dist = idx - lastIdx;
                    minDist = Math.min(dist,minDist);
                }
                lastIdx = idx;
            }
            idx++;
            a = a.next;
            b = b.next;
            c = c.next;
        }
        int maxDist = lastIdx - firstIdx;
        if(maxDist==0) maxDist = -1;
        if(minDist==Integer.MAX_VALUE) minDist = -1;
        ans[0] = minDist;
        ans[1] = maxDist;
        return ans;
    }
}
