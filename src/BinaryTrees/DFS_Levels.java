package BinaryTrees;

class Node{
    public boolean data;
    int val;
    node left;
    node right;

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

        node a = new node(3); // root
        node b = new node(4);
        node c = new node(2);
        node d = new node(-1);
        node e = new node(1);
        node f = new node(6);
        node g = new node(9);

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

    private static int levels(node root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    private static int size(node root){
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    private static int sum(node root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    private static int max(node root){
        if(root == null) return Integer.MIN_VALUE;
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    private static void preorder(node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    private static void inorder(node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    private static void postorder(node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }
}

