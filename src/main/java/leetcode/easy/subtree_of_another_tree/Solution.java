package leetcode.easy.subtree_of_another_tree;

import utils.data_structures.TreeNode;

public class Solution {
    StringBuilder rSb = new StringBuilder();
    StringBuilder srSb = new StringBuilder();

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        boolean isSubtree = false;
        rSb.append(",");
        srSb.append(",");
        traverse(subRoot, srSb, false);
        String srStr = srSb.toString();
        traverse(root, rSb, true);

        String rStr = rSb.toString();
        isSubtree = rStr.contains(srStr);

        return isSubtree;
    }

    public void traverse(TreeNode root, StringBuilder sb, boolean isRoot) {
        if (root != null) {
            sb.append(root.val).append(",");
            traverse(root.left, sb, isRoot);
            traverse(root.right, sb, isRoot);
        } else {
            sb.append("x,");
        }
    }
}
