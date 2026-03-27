package BinaryTrees;

class BalancedTree {
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
            System.out.println(new BalancedTree().isBalanced(root));
    }
    static boolean flag;
    public boolean isBalanced(Node root) {
        if(root==null) return true;
        flag = true;
        levels(root);
        return flag;
    }

    private int levels(Node root) { // kaam ki cheez
        if(root==null) return 0;
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        if(Math.abs(leftLevels-rightLevels) > 1) flag = false;
        return 1 + Math.max(leftLevels,rightLevels);
    }
}
