package leetcode.easy.rotate_string;

public class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {return false;}

        int length = goal.length();
        int lp = 0;
        int rp = length - 2;

        char glc = goal.charAt(lp);
        char grc = goal.charAt(rp);
        char glo = goal.charAt(rp + 1);

        for (int i = 0; i < length; i++) {
            char slc = s.charAt(lp);
            char src = s.charAt(rp);

            if (slc == glc && src == grc) {
                char slo;
                if (rp == (length-1)) {
                    slo = s.charAt(0);
                } else {slo = s.charAt(rp + 1);}

                if (slo == glo) {
                    return true;
                }
            }

            if (rp == (length-1)) {
                rp = 0;
            } else {rp += 1;}

            if (lp == (length-1)) {
                lp = 0;
            } else {lp += 1;}
        }

        return false;

    }
}
