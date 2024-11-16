package leetcode.network_delay_time;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    int[] minTimes;
    HashMap<Integer, List<NodeTime>> adjList;

    public int networkDelayTime(int[][] times, int n, int k) {
        minTimes = new int[n+1];
        adjList = new HashMap<>();
        boolean containK = false;

        for (int i = 0; i < times.length; i++) {
            int key = times[i][0];
            if (key == k) {
                containK = true;
            }
            List<NodeTime> neigh = adjList.computeIfAbsent(key, p -> new ArrayList<>());
            neigh.add(new NodeTime(key, times[i][1], times[i][2]));
            adjList.put(key, neigh);
        }

        if (!containK) {return -1;}

        return findTime(k, n);
    }

    int findTime(int k, int n) {
        PriorityQueue<NodeTime> pq = new PriorityQueue<>();
        boolean[][] visited = new boolean[n+1][n+1];

        List<NodeTime> kNeigh = adjList.get(k);
        if (kNeigh.isEmpty()) {
            return -1;
        }

        for (NodeTime nb : kNeigh) {
            pq.add(nb);
            visited[nb.source][nb.target] = true;
        }

        while (!pq.isEmpty()) {
            NodeTime curr = pq.poll();

            if (minTimes[curr.target] != 0 && curr.time >= minTimes[curr.target]) {
                continue;
            }

            minTimes[curr.target] += curr.time;

            List<NodeTime> neighbors = adjList.get(curr.target);
            if (neighbors != null) {
                for (NodeTime nb : neighbors) {
                    if (!visited[nb.source][nb.target]) {
                        pq.add(new NodeTime(nb.source, nb.target, nb.time + curr.time));
                        visited[nb.source][nb.target] = true;
                    }
                }
            }
        }


        minTimes[k] = 0;
        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (minTimes[i] == 0 && i != k) {
                return -1;
            }

            if (minTimes[i] > res) {
                res = minTimes[i];
            }
        }

        return res;
    }

    class NodeTime implements Comparable<NodeTime> {
        int source;
        int target;
        int time;

        NodeTime(int source, int target, int time) {
            this.source = source;
            this.target = target;
            this.time = time;
        }

        @Override
        public int compareTo( NodeTime o2) {
            return Integer.compare(time, o2.time);
        }
    }
}
