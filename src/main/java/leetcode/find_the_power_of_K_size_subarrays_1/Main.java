package leetcode.find_the_power_of_K_size_subarrays_1;

import utils.OutputUtils;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        OutputUtils.initPrintWriter();

        OutputUtils.printArray(solution.resultsArray(new int[]{1, 2, 3, 4, 3, 2, 5}, 3));
        OutputUtils.printArray(solution.resultsArray(new int[]{2,2,2,2,2}, 4));
        OutputUtils.printArray(solution.resultsArray(new int[]{3,2,3,2,3,2}, 2));

        OutputUtils.closePrintWriter();
    }
}
