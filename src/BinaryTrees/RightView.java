package BinaryTrees;

import java.util.ArrayList;

class NODE {
    int data;
    NODE left;
    NODE right;

    NODE(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class RightView {

    public static void main(String[] args) {

        NODE root = new NODE(1);
        root.left = new NODE(2);
        root.right = new NODE(3);
        root.left.left = new NODE(4);
        root.left.right = new NODE(5);

        RightView obj = new RightView();
        System.out.println(obj.rightView(root));
    }

    ArrayList<Integer> rightView(NODE root) {
        ArrayList<Integer> ans = new ArrayList<>();
        view(root, 0, ans);
        return ans;
    }

    private void view(NODE root, int level, ArrayList<Integer> ans) {

        if (root == null) return;

        if (level == ans.size()) {
            ans.add(root.data);
        }

        // Right first for Right View
        view(root.right, level + 1, ans);
        view(root.left, level + 1, ans);
    }
}