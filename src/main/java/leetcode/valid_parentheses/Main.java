package leetcode.valid_parentheses;

import utils.OutputUtils;

import java.io.PrintWriter;

public class Main {
    // Valid Parentheses
    // https://leetcode.com/problems/valid-parentheses/

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintWriter pw = OutputUtils.initPrintWriter();
        pw.println(solution.isValid("()"));
        pw.println(solution.isValid("()[]{}"));
        pw.println(solution.isValid("(]"));
        pw.println(solution.isValid("([])"));

        OutputUtils.closePrintWriter();
    }
}
