package leetcode.easy.balanced_binary_tree;

import utils.data_structures.TreeNode;

public class Solution {
    int d = 0;

    public boolean isBalanced(TreeNode root) {
        depthOfTree(root);
        if (d > 1) {
            return false;
        } else {
            return true;
        }
    }

    public int depthOfTree(TreeNode root) {
        if (root != null) {
            int left = depthOfTree(root.left);
            int right = depthOfTree(root.right);
            if (d <= 1) {
                d = Math.abs(left-right);
            }
            return 1 + Math.max(left, right);
        } else {
            return 0;
        }
    }
}
