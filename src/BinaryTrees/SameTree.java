package BinaryTrees;

public class SameTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        SameTree obj = new SameTree();
        System.out.println(obj.isIdentical(root1,root2));
    }
    //     0      0        Not Same
    //    /        \
    //   0          0
    boolean isIdentical(Node p, Node q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.data != q.data) return false;
        return isIdentical(p.left,q.left) && isIdentical(p.right,q.right);
    }
}
