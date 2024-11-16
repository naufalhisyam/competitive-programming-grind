package leetcode.easy.invert_binary_tree;

import utils.OutputUtils;
import utils.data_structures.TreeNode;

import java.io.PrintWriter;

public class Main {
    // Invert Binary Tree
    // https://leetcode.com/problems/invert-binary-tree/

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintWriter pw = OutputUtils.initPrintWriter();

        TreeNode subtree1 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode subtree2 = new TreeNode(7, new TreeNode(6), new TreeNode(9));
        TreeNode root =  new TreeNode(4, subtree1, subtree2);

        pw.println(solution.invertTree(root));

        OutputUtils.closePrintWriter();

    }
}
