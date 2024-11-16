package leetcode.easy.binary_search;

import utils.OutputUtils;

import java.io.PrintWriter;

public class Main {
    // Binary Search
    // https://leetcode.com/problems/binary-search

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintWriter pw = OutputUtils.initPrintWriter();

        int[] arr = new int[]{-1,0,3,5,9,12};
        pw.println(solution.search(arr, 9));
        pw.println(solution.search(arr, 2));

        OutputUtils.closePrintWriter();
    }
}
