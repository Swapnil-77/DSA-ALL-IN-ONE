package BinarySearchTree;

public class InsertInBST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = null;
        InsertInBST obj = new InsertInBST();

        root = obj.insert(root, 10);
        root = obj.insert(root, 5);
        root = obj.insert(root, 15);

        System.out.print("Inorder traversal: ");
        inorder(root);
    }

    Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        if (root.data < key) {
            root.right = insert(root.right, key);
        } else if (root.data > key) {
            root.left = insert(root.left, key);
        }

        return root;
    }

    //  Print BST (sorted order)
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}
