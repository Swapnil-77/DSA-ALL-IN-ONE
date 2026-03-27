package BinarySearchTree;

public class MinMaxInBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);

        MinMaxInBST obj = new MinMaxInBST();

        System.out.println(obj.minValue(root));
        System.out.println(obj.maxValue(root));
    }

    // Function to find minimum element
    int minValue(Node root) {
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.data;
    }

    // Function to find maximum element
    int maxValue(Node root) {
        Node temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        return temp.data;
    }
}
