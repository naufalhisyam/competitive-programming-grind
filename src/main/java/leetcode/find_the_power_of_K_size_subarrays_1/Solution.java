package leetcode.find_the_power_of_K_size_subarrays_1;

public class Solution {

    public int[] resultsArray(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }

        int[] result = new int[nums.length - k + 1];

        int cnt = 1;
        int startIdx = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i < nums.length - k + 1) {
                result[i] = -1;
            }

            if (nums[i] + 1 == nums[i + 1]) {
                cnt += 1;
            } else {
                if (cnt != 1) {
                    startIdx += cnt;
                } else {
                    startIdx += 1;
                }
                cnt = 1;
            }

            if (cnt == k) {
                cnt -= 1;
                result[startIdx] = nums[i + 1];
                startIdx += 1;
            }
        }

        return result;
    }
}
