package BinaryTrees;

public class IdenticalTree {
    public static void main(String[] args) {
        node a = new node(0);
        node b = new node(0);
        node c = new node(0);
        node d = new node(0);
        a.left = c;
        a.right = d;
        System.out.println(new IdenticalTree().isIdentical(a,b));
    }
    //     0      0        Not Same
    //    /        \
    //   0          0
    boolean isIdentical(node p, node q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.data != q.data) return false;
        return isIdentical(p.left,q.left) && isIdentical(p.right,q.right);
    }
}
