package leetcode.valid_parentheses;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {return false;}

        Deque<Character> cstack = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                cstack.addLast(c);
            } else {
                if (!cstack.isEmpty()) {
                    char oc = cstack.pollLast();
                    if (c == ')' && oc != '(' ||
                            c == ']' && oc != '[' ||
                            c == '}' && oc != '{') {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        return cstack.isEmpty();
    }
}
