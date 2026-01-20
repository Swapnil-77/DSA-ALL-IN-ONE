package BinarySearch;

public class SinglesAmongDoubles {
    public static void main(String[] args) {
        SinglesAmongDoubles obj = new SinglesAmongDoubles();
        int[] arr = {1,1,2,2,3,4,4,5,5};
        int ans = obj.findOnce(arr);
        System.out.println("The single element is: " + ans);
    }
    int findOnce(int[] arr) {
        int n = arr.length;
        if(n == 1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        int lo = 0, hi = n - 1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1])
                return arr[mid];
            int f = mid, s = mid;
            if(arr[mid-1]==arr[mid]) f = mid - 1;
            else s = mid + 1;
            int leftCount = f - lo;
            int rightCount = hi - s;
            if(leftCount%2 == 0) lo = s + 1;
            else hi = f - 1;
        }
        return 0;
    }
}
