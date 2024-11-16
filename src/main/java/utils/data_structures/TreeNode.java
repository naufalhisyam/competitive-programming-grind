package utils.data_structures;

import java.util.ArrayDeque;
import java.util.Deque;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}

    public TreeNode(int val) { this.val = val; }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.addLast(this);
        while (!queue.isEmpty()) {
            TreeNode node = queue.removeFirst();
            sb.append(node.val);

            if (node.left != null) {
                queue.addLast(node.left);
            }
            if (node.right != null) {
                queue.addLast(node.right);
            }

            if (!queue.isEmpty()) {
                sb.append(",");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
