package BinarySearchTree;

import java.util.ArrayList;

public class MorrisInorder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        MorrisInorder obj = new MorrisInorder();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        ArrayList<Integer> ans = obj.inOrder(root);
        System.out.println(ans);
    }
    ArrayList<Integer> inOrder(Node root) { // Morris
        ArrayList<Integer> ans = new ArrayList<>();
        Node curr = root;
        while(curr != null){
            if(curr.left != null){
                // find pred and do work
                Node pred = curr.left;
                while(pred.right != null && pred.right != curr)
                    pred = pred.right;
                if(pred.right == null){ // link
                    pred.right = curr;
                    curr = curr.left;
                }
                else{ // pred.right = curr // Unlink & Print
                    pred.right = null;
                    ans.add(curr.data);
                    curr = curr.right;
                }
            }
            else{
                ans.add(curr.data);
                curr = curr.right;
            }
        }
        return ans;
    }
}
