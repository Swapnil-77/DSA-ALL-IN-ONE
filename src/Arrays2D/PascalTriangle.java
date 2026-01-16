package Arrays2D;

import java.util.ArrayList;

public class PascalTriangle {

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> ans = pascalTriangle(n);
        System.out.println(ans);
    }

    static ArrayList<Integer> pascalTriangle(int n) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        // create triangle structure
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                a.add(0);
            }
            arr.add(a);
        }

        // fill values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    arr.get(i).set(j, 1);
                else {
                    int up = arr.get(i - 1).get(j);
                    int upLeft = arr.get(i - 1).get(j - 1);
                    arr.get(i).set(j, up + upLeft);
                }
            }
        }

        return arr.get(n - 1);
    }
}