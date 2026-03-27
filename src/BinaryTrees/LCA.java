package BinaryTrees;

public class LCA {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        LCA obj = new LCA();
        System.out.println(obj.lca(root,4,5).data); // 2
    }
    Node lca(Node root, int p, int q) { // TC = O(n)
        if(root==null) return null;
        if(root.data==p || root.data==q) return root;
        Node l = lca(root.left,p,q);
        Node r = lca(root.right,p,q);
        if(l!=null && r!=null) return root;
        return (l==null) ? r : l;
    }
}
