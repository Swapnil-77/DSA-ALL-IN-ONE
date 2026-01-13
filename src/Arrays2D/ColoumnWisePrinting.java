package Arrays2D;

public class ColoumnWisePrinting {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 0, 1, 7}
        };
        printColWise(arr);
    }
    public static void printColWise(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for(int j=0;j<n;j++){ // cols
            for(int i=0;i<m;i++){ // rows
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
