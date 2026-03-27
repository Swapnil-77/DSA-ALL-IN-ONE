package BinarySearchTree;

public class SearchInBST {

    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        SearchInBST obj = new SearchInBST();
        Node root = obj.new Node(5);
        root.left = obj.new Node(3);
        root.right = obj.new Node(7);
        root.left.left = obj.new Node(2);
        root.left.right = obj.new Node(4);
        root.right.left = obj.new Node(6);
        root.right.right = obj.new Node(8);

        System.out.println(obj.search(root, 4)); // true
        System.out.println(obj.search(root, 10)); // false
    }

    boolean search(Node root, int x) {
        if(root==null) return false;
        if(root.data == x) return true;
        else if(root.data > x) return search(root.left,x);
        else return search(root.right,x);
    }
}
