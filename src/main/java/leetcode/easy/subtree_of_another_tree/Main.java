package leetcode.easy.subtree_of_another_tree;

import utils.OutputUtils;
import utils.data_structures.TreeNode;

import java.io.PrintWriter;

public class Main {
    // Subtree of Another Tree
    // https://leetcode.com/problems/subtree-of-another-tree/

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintWriter pw = OutputUtils.initPrintWriter();

        TreeNode subtree = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        TreeNode root =  new TreeNode(3, subtree, new TreeNode(5));
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));

        pw.println(solution.isSubtree(root, subRoot));

        OutputUtils.closePrintWriter();
    }
}
