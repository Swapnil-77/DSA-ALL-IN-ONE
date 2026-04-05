package BinarySearchTree;

public class BST_To_GST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int sum;

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        transformTree(root);

        System.out.print("Inorder after transform: ");
        inorder(root);
    }

    // 🔥 Reverse Inorder (Right → Root → Left)
    public static void revInorder(Node root) {
        if (root == null) return;

        revInorder(root.right);

        int val = root.data;
        root.data = sum;
        sum += val;

        revInorder(root.left);
    }

    // 🔥 Main function
    public static void transformTree(Node root) {
        sum = 0;
        revInorder(root);
    }

    // 🔥 Inorder Print (Left → Root → Right)
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}
    // public static void revInorder(Node root, ArrayList<Node> arr) {
    //     if(root==null) return;
    //     revInorder(root.right,arr);
    //     arr.add(root);
    //     revInorder(root.left,arr);
    // } // 7 6 3 2 1 -> 0 7 13 16 18
    // public static void transformTree(Node root) {
    //     ArrayList<Node> arr = new ArrayList<>();
    //     revInorder(root,arr);
    //     int sum = 0;
    //     for(int i=0;i<arr.size();i++){
    //         int val = arr.get(i).data;
    //         arr.get(i).data = sum;
    //         sum += val;
    //     }
    // }

