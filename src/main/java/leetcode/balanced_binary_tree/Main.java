package leetcode.balanced_binary_tree;

import utils.OutputUtils;
import utils.data_structures.TreeNode;

import java.io.PrintWriter;

public class Main {
    // Balanced Binary Tree
    // https://leetcode.com/problems/balanced-binary-tree/

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintWriter pw = OutputUtils.initPrintWriter();

        TreeNode subtree = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root =  new TreeNode(3, new TreeNode(9), subtree);

        pw.println(solution.isBalanced(root));
        pw.println(solution.isBalanced(null));

        OutputUtils.closePrintWriter();
    }
}
