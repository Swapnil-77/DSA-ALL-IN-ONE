package BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        SquareRoot obj = new SquareRoot();
        int n = 20;
        int ans = obj.mySqrt(n);
        System.out.println("Square root of " + n + " is: " + ans);
    }
    public int mySqrt(int n) {
        if(n==0) return 0;
        int lo = 1, hi = n;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(mid == n/mid) return mid;
            else if(mid > n/mid) hi = mid - 1;
            else lo = mid + 1;
        }
        return hi;
    }
}
