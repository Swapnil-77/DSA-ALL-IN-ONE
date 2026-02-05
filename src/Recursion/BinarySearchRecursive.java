package Recursion;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        BinarySearchRecursive obj = new BinarySearchRecursive();
        int result = obj.search(nums,target);
        System.out.println("Index of target "+target+" is: "+result);
    }

    public int helper(int[] nums, int target, int lo, int hi) {
        if(lo>hi) return -1;
        int mid = lo + (hi-lo)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]>target) return helper(nums,target,lo,mid-1);
        else return helper(nums,target,mid+1,hi);
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        return helper(nums,target,0,n-1);
    }
}
