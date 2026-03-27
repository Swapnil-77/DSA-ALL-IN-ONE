package BinaryTrees;

public class Diameter {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            System.out.println(new Diameter().diameter(root));
    }
    static int max;
    int diameter(Node root) {
        max = 0;
        levels(root);
        return max;
    }
    int levels(Node root) { // kaam ki cheez
        if(root==null) return 0;
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        max = Math.max(max,leftLevels + rightLevels); // extra
        return 1 + Math.max(leftLevels,rightLevels);
    }
}
