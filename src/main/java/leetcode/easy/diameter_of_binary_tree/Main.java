package leetcode.easy.diameter_of_binary_tree;

import utils.OutputUtils;
import utils.data_structures.TreeNode;

import java.io.PrintWriter;

public class Main {
    // Diameter of Binary Tree
    // https://leetcode.com/problems/diameter-of-binary-tree/

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintWriter pw = OutputUtils.initPrintWriter();

        TreeNode subtree = new TreeNode(2, new TreeNode(4), new TreeNode(5));
        TreeNode root =  new TreeNode(1, subtree, new TreeNode(3));
        TreeNode root2 = new TreeNode(1, new TreeNode(2), null);

        pw.println(solution.diameterOfBinaryTree(root));
        pw.println(solution.diameterOfBinaryTree(root2));

        OutputUtils.closePrintWriter();
    }
}