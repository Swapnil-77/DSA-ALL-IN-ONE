package BinaryTrees;

public class PathSum {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);

        int targetSum = 22;
        PathSum ps = new PathSum();
        boolean result = ps.hasPathSum(root, targetSum);
        System.out.println("Path with sum " + targetSum + ": " + result);
    }
    boolean hasPathSum(Node root, int target) {
        // Your code here
        if(root == null) return false;

        if(root.left == null && root.right == null) {
            return target == root.data;
        }

        int remaining = target - root.data;

        return hasPathSum(root.left, remaining) ||
                hasPathSum(root.right, remaining);
    }
}
