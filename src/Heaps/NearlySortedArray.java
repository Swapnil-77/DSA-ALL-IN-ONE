package Heaps;

import java.util.PriorityQueue;

public class NearlySortedArray {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4,6};
        int k = 2;
        NearlySortedArray obj = new NearlySortedArray();
        obj.nearlySorted(arr, k);
        for(int ele:arr) System.out.print(ele+" ");
    }
    public void nearlySorted(int[] arr, int k) {
        // TC = O(nlogk)   AS = O(k)
        int idx = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) arr[idx++] = pq.remove();
        }
        while(pq.size()>0) arr[idx++] = pq.remove();
    }
}