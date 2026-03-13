package BinaryTrees;

public class SymmetricTree {
    public static void main(String[] args) {
        Nodes root = new Nodes(1);
        root.left = new Nodes(2);
        root.right = new Nodes(2);
        root.left.left = new Nodes(3);
        root.left.right = new Nodes(4);
        root.right.left = new Nodes(4);
        root.right.right = new Nodes(3);
        SymmetricTree obj = new SymmetricTree();
        System.out.println(obj.isSymmetric(root));
    }
    public boolean isSymmetric(Nodes root) {
        mirror(root.left);
        return isIdentical(root.left,root.right);
    }
    boolean isIdentical(Nodes p, Nodes q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.data != q.data) return false;
        return isIdentical(p.left,q.left) && isIdentical(p.right,q.right);
    }
    void mirror(Nodes root) {
        if(root==null) return;
        Nodes temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
}
