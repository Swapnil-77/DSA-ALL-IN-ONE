package BinaryTrees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class PostOrderIterative {
    static class Node {
        int data;
        PostOrderIterative.Node left;
        PostOrderIterative.Node right;

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
        PostOrderIterative obj = new PostOrderIterative();
        System.out.println(obj.postOrder(root));
    }
    ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(st.size()>0){
            Node top = st.pop();
            ans.add(top.data);
            if(top.left!=null) st.push(top.left);
            if(top.right!=null) st.push(top.right);
        }
        Collections.reverse(ans);
        return ans;
    }
}
