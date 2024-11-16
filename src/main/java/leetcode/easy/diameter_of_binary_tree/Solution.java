package leetcode.easy.diameter_of_binary_tree;

import utils.data_structures.TreeNode;

public class Solution {
    int res;
    public int diameterOfBinaryTree(TreeNode root) {
        res = 0;
        heightOfBinaryTree(root);
        return res;
    }

    public int heightOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = heightOfBinaryTree(root.left);
            int right = heightOfBinaryTree(root.right);
            res = Math.max(res, left + right);
            return 1 + Math.max(left, right);
        }
    }
}