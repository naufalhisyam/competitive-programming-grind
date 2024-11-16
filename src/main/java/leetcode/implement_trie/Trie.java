package leetcode.implement_trie;

public class Trie {

    public Character val;
    public Trie[] children;
    public boolean endOfWord;

    public Trie() {
        this.val = null;
        this.children = new Trie[26];
        this.endOfWord = false;
    }

    public Trie(Character val) {
        this.val = val;
        this.children = new Trie[26];
        this.endOfWord = false;
    }

    public void insert(String word) {
        Trie node = this;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new Trie(c);
            }
            node = node.children[idx];
        }
        node.endOfWord = true;
    }

    public boolean search(String word) {
        Trie node = this;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null || node.children[idx].val == null) {
                return false;
            }
            node = node.children[idx];
        }
        return node.endOfWord;
    }

    public boolean startsWith(String prefix) {
        Trie node = this;
        for (char c : prefix.toCharArray()) {
            int idx = c - 'a';
            if (node.children[idx] == null || node.children[idx].val == null) {
                return false;
            }
            node = node.children[idx];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
