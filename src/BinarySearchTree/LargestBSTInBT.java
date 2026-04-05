package BinarySearchTree;

public class LargestBSTInBT {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static class Quad {
        int max;
        int min;
        int size;
        boolean isBST;

        Quad(int max, int min, int size, boolean isBST) {
            this.max = max;
            this.min = min;
            this.size = size;
            this.isBST = isBST;
        }
    }

    static int maxSize;

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(1);
        root.left.right = new Node(8);
        root.right.right = new Node(7);

        System.out.println("Largest BST size: " + largestBst(root));
    }

    public static int largestBst(Node root) {
        maxSize = 0;
        helper(root);
        return maxSize;
    }

    public static Quad helper(Node root) {
        if (root == null)
            return new Quad(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, true);

        Quad lst = helper(root.left);
        Quad rst = helper(root.right);

        int max = Math.max(root.data, Math.max(lst.max, rst.max));
        int min = Math.min(root.data, Math.min(lst.min, rst.min));
        int size = 1 + lst.size + rst.size;

        boolean isBST = lst.isBST && rst.isBST &&
                (lst.max < root.data) &&
                (rst.min > root.data);

        if (isBST) {
            maxSize = Math.max(maxSize, size);
        }

        return new Quad(max, min, size, isBST);
    }
}