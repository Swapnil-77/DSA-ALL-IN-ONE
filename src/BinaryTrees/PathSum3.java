package BinaryTrees;

import java.util.ArrayList;

public class PathSum3 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(printPaths(root,7));
    }
    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root,arr,ans,sum);
        return ans;
    }

    private static void dfs(Node root, ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ans, int sum) {
        arr.add(root.data);
        // ✅ If current path sum matches, add it
        if (sum == root.data) {
            ans.add(new ArrayList<>(arr));
        }
        // Continue searching children
        if (root.left != null) dfs(root.left, arr, ans, sum - root.data);
        if (root.right != null) dfs(root.right, arr, ans, sum - root.data);
        arr.remove(arr.size() - 1); // backtrack
    }
}
