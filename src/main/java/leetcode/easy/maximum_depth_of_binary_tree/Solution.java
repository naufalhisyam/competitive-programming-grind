package leetcode.easy.maximum_depth_of_binary_tree;

import utils.data_structures.TreeNode;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root != null) {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        } else {return 0;}
    }
}