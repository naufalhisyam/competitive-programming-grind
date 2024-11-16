package leetcode.easy.Kth_largest_element_in_a_stream;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargest {
    int K;
    Queue<Integer> minHeap;

    public KthLargest(int k, int[] nums) {
        this.K = k;
        this.minHeap = new PriorityQueue<>();

        for (int n : nums) {
            if (minHeap.size() == K) {
                if (n > minHeap.peek()) {
                    minHeap.offer(n);
                    minHeap.poll();
                }
            } else {
                minHeap.offer(n);
            }
        }
    }

    public int add(int val) {
        if (minHeap.size() == K) {
            minHeap.offer(val);
            minHeap.poll();
        } else {
            minHeap.offer(val);
        }

        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */