package BasicSorting;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int result = kthSmallest(arr, k);
        System.out.println(k + "th smallest element is " + result);
    }


    public static int kthSmallest(int[] arr, int k) {
        int n = arr.length;
        // TC = O(n*k)
        for(int i=0;i<k;i++) { // n-1 passes
            int min = Integer.MAX_VALUE, mindx = -1;
            for(int j=i;j<n;j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        return arr[k-1];
    }
}
