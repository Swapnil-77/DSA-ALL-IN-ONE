package BinarySearchTree;

public class kThSmallestInBST {
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        kThSmallestInBST obj = new kThSmallestInBST();
        Node root = obj.new Node(5);
        root.left = obj.new Node(3);
        root.right = obj.new Node(6);
        root.left.left = obj.new Node(2);
        root.left.right = obj.new Node(4);
        int ans = obj.kthSmallest(root, 3);
        System.out.println(ans);
    }
    static int ans;
    static int k2;
    public void inorder(Node root) {
        if(root==null) return;
        inorder(root.left);
        k2--;
        if(k2==0) ans = root.data;
        inorder(root.right);
    }
    public int kthSmallest(Node root, int k) {
        k2 = k;
        ans = -1;
        inorder(root);
        return ans;
    }
}
