package leetcode.easy.valid_anagram;

import utils.OutputUtils;

import java.io.PrintWriter;

public class Main {
    // Valid Anagram
    // https://leetcode.com/problems/valid-anagram

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintWriter pw = OutputUtils.initPrintWriter();

        pw.println(solution.isAnagram("anagram", "nagaram"));
        pw.println(solution.isAnagram("rat", "car"));

        OutputUtils.closePrintWriter();
    }
}
