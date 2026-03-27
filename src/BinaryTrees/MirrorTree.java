package BinaryTrees;

public class MirrorTree {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        MirrorTree obj = new MirrorTree();
        obj.mirror(root);
    }
    void mirror(node root) {
        if(root==null) return;
        node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
}
// class Solution { // SPECIAL
//     void mirror(Node root) {
//         if(root==null) return;
//         mirror(root.left);
//         Node temp = root.left;
//         root.left = root.right;
//         root.right = temp;
//         mirror(root.left);
//     }
// }

