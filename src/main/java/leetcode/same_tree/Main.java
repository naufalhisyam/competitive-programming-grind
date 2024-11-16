package leetcode.same_tree;

import utils.OutputUtils;
import utils.data_structures.TreeNode;

import java.io.PrintWriter;

public class Main {
    // Same Tree
    // https://leetcode.com/problems/same-tree/

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintWriter pw = OutputUtils.initPrintWriter();

        TreeNode tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode tree2 =  new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode tree3 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode tree4 =  new TreeNode(1, new TreeNode(1), new TreeNode(2));

        pw.println(solution.isSameTree(tree1, tree2));
        pw.println(solution.isSameTree(tree3, tree4));

        OutputUtils.closePrintWriter();
    }
}
