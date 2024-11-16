package leetcode.same_tree;

import utils.data_structures.TreeNode;

public class Solution {
    StringBuilder pval = new StringBuilder();
    StringBuilder qval = new StringBuilder();

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {return true;}
        if (p == null && q != null || q == null && p != null) {
            return false;
        }

        boolean isEqual = true;

        traverseInorderTreeP(p);
        traverseInorderTreeQ(q);
        String ps = pval.toString();
        String qs = qval.toString();
        if (!ps.equals(qs)) {isEqual = false;}

        return isEqual;
    }

    public void traverseInorderTreeP(TreeNode root) {
        if (root != null) {
            pval.append(root.val);
            traverseInorderTreeP(root.left);
            traverseInorderTreeP(root.right);
        } else {
            pval.append("+");
        }
    }

    public void traverseInorderTreeQ(TreeNode root) {
        if (root != null) {
            qval.append(root.val);
            traverseInorderTreeQ(root.left);
            traverseInorderTreeQ(root.right);
        } else {
            qval.append("+");
        }
    }
}
