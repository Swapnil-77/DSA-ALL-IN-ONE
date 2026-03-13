package BinaryTrees;

public class IdenticalTree {
    public static void main(String[] args) {
        Nodes a = new Nodes(0);
        Nodes b = new Nodes(0);
        Nodes c = new Nodes(0);
        Nodes d = new Nodes(0);
        a.left = c;
        a.right = d;
        System.out.println(new IdenticalTree().isIdentical(a,b));
    }
    //     0      0        Not Same
    //    /        \
    //   0          0
    boolean isIdentical(Nodes p, Nodes q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.data != q.data) return false;
        return isIdentical(p.left,q.left) && isIdentical(p.right,q.right);
    }
}
