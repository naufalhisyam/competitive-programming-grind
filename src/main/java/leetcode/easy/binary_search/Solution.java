package leetcode.easy.binary_search;

public class Solution {
    public int search(int[] nums, int target) {
        int l_point = 0;
        int r_point = nums.length - 1;
        int m_point;

        if (nums[l_point] == target) {
            return l_point;
        }
        if (nums[r_point] == target) {
            return r_point;
        }

        while (r_point > l_point) {
            m_point = (l_point + r_point) /2;
            if (nums[m_point] == target) {
                return m_point;
            }

            if (nums[m_point] > target) {
                r_point = m_point;
            } else {
                l_point = m_point;
            }

            if (r_point-l_point == 1) {
                break;
            }

        }
        return -1;
    }
}
