package leetcode.easy.maximum_depth_of_binary_tree;

import utils.OutputUtils;
import utils.data_structures.TreeNode;

import java.io.PrintWriter;

public class Main {
    // Maximum Depth of Binary Tree
    // https://leetcode.com/problems/maximum-depth-of-binary-tree

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintWriter pw = OutputUtils.initPrintWriter();

        TreeNode subtree = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root =  new TreeNode(3, new TreeNode(9), subtree);
        TreeNode root2 = new TreeNode(1, null, new TreeNode(2));

        pw.println(solution.maxDepth(root));
        pw.println(solution.maxDepth(root2));

        OutputUtils.closePrintWriter();
    }
}
