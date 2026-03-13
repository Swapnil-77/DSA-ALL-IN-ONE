package BinaryTrees;

class Node{
    public boolean data;
    int val;
    Nodes left;
    Nodes right;

    Node(int val){
        this.val = val;
    }
}

public class DFS_Levels {

    public static void main(String[] args) {

        //        3
        //      /   \
        //     4     2
        //   /   \ /   \
        // -1    1 6    9

        Nodes a = new Nodes(3); // root
        Nodes b = new Nodes(4);
        Nodes c = new Nodes(2);
        Nodes d = new Nodes(-1);
        Nodes e = new Nodes(1);
        Nodes f = new Nodes(6);
        Nodes g = new Nodes(9);

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = e;

        c.left = f;
        c.right = g;

        preorder(a);
        System.out.println();

        inorder(a);
        System.out.println();

        postorder(a);
    }

    private static int levels(Nodes root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    private static int size(Nodes root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    private static int sum(Nodes root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    private static int max(Nodes root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    private static void preorder(Nodes root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    private static void inorder(Nodes root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    private static void postorder(Nodes root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
}

