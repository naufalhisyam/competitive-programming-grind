package leetcode.contains_duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 1) {return false;}
        if (nums[1] == nums[0]) {return true;}
        Set<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!hs.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}