package leetcode.contains_duplicate;

import utils.OutputUtils;

import java.io.PrintWriter;

public class Main {
    // Contains Duplicate
    // https://leetcode.com/problems/contains-duplicate/

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintWriter pw = OutputUtils.initPrintWriter();

        pw.println(solution.containsDuplicate(new int[]{1,2,3,1}));
        pw.println(solution.containsDuplicate(new int[]{1,2,3,4}));
        pw.println(solution.containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));

        OutputUtils.closePrintWriter();
    }
}
