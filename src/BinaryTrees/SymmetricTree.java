package BinaryTrees;

public class SymmetricTree {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(2);
        root.left.left = new node(3);
        root.left.right = new node(4);
        root.right.left = new node(4);
        root.right.right = new node(3);
        SymmetricTree obj = new SymmetricTree();
        System.out.println(obj.isSymmetric(root));
    }
    public boolean isSymmetric(node root) {
        mirror(root.left);
        return isIdentical(root.left,root.right);
    }
    boolean isIdentical(node p, node q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.data != q.data) return false;
        return isIdentical(p.left,q.left) && isIdentical(p.right,q.right);
    }
    void mirror(node root) {
        if(root==null) return;
        node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
}
