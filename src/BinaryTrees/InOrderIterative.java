package BinaryTrees;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderIterative {

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

        InOrderIterative obj = new InOrderIterative();
        System.out.println(obj.inorder(root));
    }

    public ArrayList<Integer> inorder(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();

        Node curr = root;

        while (st.size() > 0 || curr != null) {

            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            }
            else {
                Node top = st.pop();
                ans.add(top.data);
                curr = top.right;
            }
        }

        return ans;
    }
}
