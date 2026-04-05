package BinarySearchTree;

public class FlattenABTToLLMorris {
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
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.right = new Node(6);

        flatten(root);

        // Print the flattened linked list
        Node curr = root;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }
    public static void flatten(Node root) { // Morris
        Node curr = root;
        while(curr!=null){
            if(curr.left!=null){ // pred nikal sakta hai
                Node pred = curr.left;
                while(pred.right!=null) pred = pred.right;
                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
                curr = curr.right;
            }
            else curr = curr.right;
        }
    }
}
