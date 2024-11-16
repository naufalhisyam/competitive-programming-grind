package leetcode.valid_anagram;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {return false;}

        int[] cArr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int idxS = (int) s.charAt(i) - (int) 'a';
            int idxT = (int) t.charAt(i) - (int) 'a';
            cArr[idxS] += 1;
            cArr[idxT] -= 1;
        }

        for (int cnt : cArr) {
            if (cnt != 0) {
                return false;
            }
        }
        return true;
    }
}
