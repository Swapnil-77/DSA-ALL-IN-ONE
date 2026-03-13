package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

class Nodes {
    public boolean data;
    int val;
    Nodes left;
    Nodes right;
    Nodes(int val){
        this.val = val;
    }
}
class Pair{
    Nodes nodes;
    int level;
    Pair(Nodes nodes, int level){
        this.nodes = nodes;
        this.level = level;
    }
}
public class Implementation {
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
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
//        for(int i=0;i<levels(a);i++){ // O(n^2)
//            kThLevel(a,0,i);
//            System.out.println();
//        }

//        levelOrder(a);
//        levelOrderLineWise(a);
//        preorder(a);
//        System.out.println();
//        inorder(a);
//        System.out.println();
//        postorder(a);
//        System.out.println();
//        System.out.println(size(a));
//        System.out.println(sum(a));
//        System.out.println(max(a));
//        System.out.println(levels(a));
    }

    private static void kThLevel(Nodes root, int level, int k) {
        if(root==null) return;
        if(level==k) System.out.print(root.val+" ");
        kThLevel(root.left,level+1,k);
        kThLevel(root.right,level+1,k);
    }
    private static void levelOrderLineWise(Nodes root) {
        Queue<Pair> q = new LinkedList<>();
        int currLevel = 0;
        q.add(new Pair(root,0));
        while(q.size()>0){
            Pair front = q.remove();
            Nodes nodes = front.nodes;
            int level = front.level;
            if(front.level!=currLevel){ // important
                currLevel++;
                System.out.println();
            }
            System.out.print(front.nodes.val+" ");
            if(nodes.left!=null) q.add(new Pair(nodes.left,level+1));
            if(nodes.right!=null) q.add(new Pair(nodes.right,level+1));
        }
        System.out.println();
    }
    private static void levelOrder(Nodes root) {
        Queue<Nodes> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            Nodes front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();
    }

    private static int levels(Nodes root) { // kaam ki cheez
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    private static int size(Nodes root) {
        if(root==null) return 0;
        // if(root.left==null && root.right==null) return 1;
        return 1 + size(root.left) + size(root.right);
            }
    private static int sum(Nodes root) {
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    private static int max(Nodes root) {
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    private static void preorder(Nodes root) {
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
       preorder(root.right);
   }
    private static void inorder(Nodes root) {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    private static void postorder(Nodes root) {
        if(root==null) return;
        postorder(root.left);
       postorder(root.right);
        System.out.print(root.val+" ");
   }

}