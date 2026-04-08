package DP;

public class CountSquareSubmatricesWithAllOnes {
    public static void main(String[] args) {
        int[][] arr = {{0,1,1,1},{1,1,1,1},{0,1,1,1}};
        CountSquareSubmatricesWithAllOnes obj = new CountSquareSubmatricesWithAllOnes();
        System.out.println(obj.countSquares(arr.length,arr[0].length,arr));
    }

    // 🔹 Memoization (Top-Down DP with recursion) 🔹
    /*
    static int[][] dp;
    public int countSquares(int N, int M, int arr[][]) {
        dp = new int[N][M];
        int count = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                count += helper(i,j,arr);
            }
        }
        return count;
    }
     */

    // 🔹 Tabulation (Bottom-Up DP, O(1) space) 🔹
    public int countSquares(int N, int M, int arr[][]) {
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i!=0 && j!=0){
                    if(arr[i][j]==1){
                        arr[i][j] += Math.min(arr[i-1][j],Math.min(arr[i-1][j-1],arr[i][j-1]));
                    }
                }
                count += arr[i][j];
            }
        }
        return count;
    }

}
