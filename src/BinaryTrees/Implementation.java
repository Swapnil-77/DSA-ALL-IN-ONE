package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

class node {
    public boolean data;
    int val;
    node left;
    node right;
    node(int val){
        this.val = val;
    }
}
class pair {
    public node node;
    node nodes;
    int level;
    pair(node nodes, int level){
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
        node a = new node(3); // root
        node b = new node(4);
        node c = new node(2);
        node d = new node(-1);
        node e = new node(1);
        node f = new node(6);
        node g = new node(9);
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

    private static void kThLevel(node root, int level, int k) {
        if(root==null) return;
        if(level==k) System.out.print(root.val+" ");
        kThLevel(root.left,level+1,k);
        kThLevel(root.right,level+1,k);
    }
    private static void levelOrderLineWise(node root) {
        Queue<pair> q = new LinkedList<>();
        int currLevel = 0;
        q.add(new pair(root,0));
        while(q.size()>0){
            pair front = q.remove();
            node nodes = front.nodes;
            int level = front.level;
            if(front.level!=currLevel){ // important
                currLevel++;
                System.out.println();
            }
            System.out.print(front.nodes.val+" ");
            if(nodes.left!=null) q.add(new pair(nodes.left,level+1));
            if(nodes.right!=null) q.add(new pair(nodes.right,level+1));
        }
        System.out.println();
    }
    private static void levelOrder(node root) {
        Queue<node> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();
    }

    private static int levels(node root) { // kaam ki cheez
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    private static int size(node root) {
        if(root==null) return 0;
        // if(root.left==null && root.right==null) return 1;
        return 1 + size(root.left) + size(root.right);
            }
    private static int sum(node root) {
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    private static int max(node root) {
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    private static void preorder(node root) {
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
       preorder(root.right);
   }
    private static void inorder(node root) {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    private static void postorder(node root) {
        if(root==null) return;
        postorder(root.left);
       postorder(root.right);
        System.out.print(root.val+" ");
   }

}