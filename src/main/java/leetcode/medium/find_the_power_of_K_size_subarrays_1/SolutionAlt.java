package leetcode.medium.find_the_power_of_K_size_subarrays_1;

public class SolutionAlt {

    public int[] resultsArray(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }

        int[] result = new int[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {
            int max = -1;
            for (int j = i; j < i+k-1; j++) {
                if (nums[j+1] - nums[j] != 1) {
                    max = -1;
                    break;
                }
                max = nums[j+1];
            }

            result[i] = max;
            
            if (i == nums.length - k) {
                break;
            }
        }

        return result;
    }
}
