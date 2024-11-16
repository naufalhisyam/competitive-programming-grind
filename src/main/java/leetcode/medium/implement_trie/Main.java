package leetcode.medium.implement_trie;

import utils.OutputUtils;

import java.io.PrintWriter;

public class Main {
    // Implement Trie (Prefix Tree)
    // https://leetcode.com/problems/implement-trie-prefix-tree/

    public static void main(String[] args) {
        PrintWriter pw = OutputUtils.initPrintWriter();
        Trie trie = new Trie();
        trie.insert("apple");
        pw.println(trie.search("apple"));
        pw.println(trie.search("app"));
        pw.println(trie.startsWith("app"));
        trie.insert("app");
        pw.println(trie.search("app"));
        OutputUtils.closePrintWriter();
    }
}
