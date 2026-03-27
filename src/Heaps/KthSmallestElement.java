package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {7,10,4,3,20,15};
        int k = 3;
        System.out.println(kthSmallest(arr,k));
    }
    public static int kthSmallest(int[] arr, int k) {
        // maxheap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){ // nlogk
            pq.add(ele); // logk
            if(pq.size()>k) pq.remove(); // logk
        }
        return pq.peek();
        // TC = O(nlogk)   AS = O(k)
    }
}
