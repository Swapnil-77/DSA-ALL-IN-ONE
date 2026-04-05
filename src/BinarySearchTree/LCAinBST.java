package BinarySearchTree;

public class LCAinBST {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        LCAinBST obj = new LCAinBST();
        Node root = obj.new Node(6);
        root.left = obj.new Node(2);
        root.right = obj.new Node(8);
        root.left.left = obj.new Node(0);
        root.left.right = obj.new Node(4);
        root.right.left = obj.new Node(7);
        root.right.right = obj.new Node(9);

        Node p = root.left;  // Node with value 2
        Node q = root.right; // Node with value 8

        Node lca = obj.LCA(root, p, q);
        System.out.println("LCA of " + p.data + " and " + q.data + " is: " + lca.data);
    }
    Node LCA(Node root, Node p, Node q) {
        if(root.data > p.data && root.data > q.data)
            return LCA(root.left,p,q);
        else if(root.data < p.data && root.data < q.data)
            return LCA(root.right,p,q);
        else return root;
    }
}
