package leetcode.medium.number_of_islands;

import utils.OutputUtils;

import java.io.PrintWriter;

public class Main {
    // Number of Islands
    // https://leetcode.com/problems/number-of-islands/

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintWriter pw = OutputUtils.initPrintWriter();
        pw.println(solution.numIslands(new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}}));
        pw.println(solution.numIslands(new char[][]{{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}}));
        OutputUtils.closePrintWriter();
    }
}
