package leetcode.easy.rotate_string;

import utils.OutputUtils;

import java.io.PrintWriter;

public class Main {
    // Rotate String
    // https://leetcode.com/problems/rotate-string/

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintWriter pw = OutputUtils.initPrintWriter();
        pw.println(solution.rotateString("abcde", "cdeab"));
        pw.println(solution.rotateString("abcde", "abced"));
        OutputUtils.closePrintWriter();
    }
}
