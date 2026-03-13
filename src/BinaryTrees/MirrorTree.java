package BinaryTrees;

public class MirrorTree {
    public static void main(String[] args) {
        Nodes root = new Nodes(1);
        root.left = new Nodes(2);
        root.right = new Nodes(3);
        root.left.left = new Nodes(4);
        root.left.right = new Nodes(5);
        MirrorTree obj = new MirrorTree();
        obj.mirror(root);
    }
    void mirror(Nodes root) {
        if(root==null) return;
        Nodes temp = root.left;
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

