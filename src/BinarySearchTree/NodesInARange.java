package BinarySearchTree;

public class NodesInARange {
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        NodesInARange obj = new NodesInARange();
        Node root = obj.new Node(10);
        root.left = obj.new Node(5);
        root.right = obj.new Node(15);
        root.left.left = obj.new Node(3);
        root.left.right = obj.new Node(7);
        root.right.right = obj.new Node(18);

        int l = 7, h = 15;
        System.out.println(obj.getCount(root, l, h));
    }
    int getCount(Node root, int l, int h) {
        if(root==null) return 0;
        if(root.data < l) return getCount(root.right,l,h);
        else if(root.data > h) return getCount(root.left,l,h);
        else // l <= root.data <= h
            return 1 + getCount(root.left,l,h) + getCount(root.right,l,h);
    }
}
