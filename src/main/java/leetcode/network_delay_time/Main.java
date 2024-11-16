package leetcode.network_delay_time;

import utils.OutputUtils;

import java.io.PrintWriter;

public class Main {
    // Network Delay Time
    // https://leetcode.com/problems/network-delay-time/

    public static void main(String[] args) {
        Solution solution = new Solution();
        PrintWriter pw = OutputUtils.initPrintWriter();
        pw.println(solution.networkDelayTime(new int[][]{{2,1,1},{2,3,1},{3,4,1}}, 4, 2));
        pw.println(solution.networkDelayTime(new int[][]{{1,2,1}}, 2, 1));
        pw.println(solution.networkDelayTime(new int[][]{{1,2,1}}, 2, 2));
        OutputUtils.closePrintWriter();
    }
}
