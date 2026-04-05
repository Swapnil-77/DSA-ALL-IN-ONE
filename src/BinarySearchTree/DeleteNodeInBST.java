package BinarySearchTree;

public class DeleteNodeInBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(6);
        root.left.left = new Node(2);
        root.left.right = new Node(4);

        DeleteNodeInBST obj = new DeleteNodeInBST();

        root = obj.deleteNode(root, 3); // ✅ IMPORTANT

        System.out.print("Inorder after deletion: ");
        inorder(root);
    }

    Node deleteNode(Node root, int target) {
        if (root == null) return null;

        if (root.data > target)
            root.left = deleteNode(root.left, target);

        else if (root.data < target)
            root.right = deleteNode(root.right, target);

        else {
            // Case 1: Leaf
            if (root.left == null && root.right == null)
                return null;

            // Case 2: One child
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            // Case 3: Two children
            Node succ = root.right;
            while (succ.left != null)
                succ = succ.left;

            root.right = deleteNode(root.right, succ.data);

            succ.left = root.left;
            succ.right = root.right;

            return succ;
        }

        return root;
    }

    //  Inorder print
    public static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

