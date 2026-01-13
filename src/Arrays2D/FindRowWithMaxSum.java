package Arrays2D;

public class FindRowWithMaxSum {
    public static void main(String[] args) {

        int[][] arr = {{2,6,3,15,12},
                {4,8,0,16,2},
                {2,6,13,70,1}};
        int n = arr.length, m = arr[0].length;

        int maxSum = Integer.MIN_VALUE;
        int maxRow = -1;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<m;j++){
                sum += arr[i][j];
            }
            if(sum > maxSum){
                maxSum = sum;
                maxRow = i;
            }
        }
        System.out.println(maxSum+" "+maxRow);
    }
}
