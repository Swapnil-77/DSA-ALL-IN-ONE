package BinarySearchTree;

public class SortedArrayToBalancedBST {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        SortedArrayToBalancedBST obj = new SortedArrayToBalancedBST();

        int[] arr = {-10, -3, 0, 5, 9};
        Node root = obj.sortedArrayToBST(arr);

        System.out.print("Inorder: ");
        obj.inorder(root);
    }

    public Node sortedArrayToBST(int[] arr) {
        return convert(arr, 0, arr.length - 1);
    }

    public Node convert(int[] arr, int lo, int hi) {
        if (lo > hi) return null;

        int mid = (lo + hi) / 2;
        Node root = new Node(arr[mid]);

        root.left = convert(arr, lo, mid - 1);
        root.right = convert(arr, mid + 1, hi);

        return root;
    }

    public void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}