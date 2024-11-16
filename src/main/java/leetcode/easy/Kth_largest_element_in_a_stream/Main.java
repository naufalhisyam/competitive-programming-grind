package leetcode.easy.Kth_largest_element_in_a_stream;

import utils.OutputUtils;

import java.io.PrintWriter;

public class Main {
    // Kth Largest Element in a Stream
    // https://leetcode.com/problems/kth-largest-element-in-a-stream

    public static void main(String[] args) {
        PrintWriter pw = OutputUtils.initPrintWriter();
        KthLargest case1 = new KthLargest(3, new int[]{4,5,8,2});
        pw.print(case1.add(3) + " ");
        pw.print(case1.add(5) + " ");
        pw.print(case1.add(10) + " ");
        pw.print(case1.add(9) + " ");
        pw.println(case1.add(4));

        OutputUtils.closePrintWriter();
    }
}
