package cses.graph_algorithms.shortest_route_1;

import utils.InputUtils;

import java.io.*;
import java.util.*;

// Shortest Route 1
// https://cses.fi/problemset/task/1671/

public class ShortestRoute1 {
    static int n;
    static int m;
    static HashMap<Integer, List<CityLength>> adjList;

    public static void main(String[] args) throws IOException {
        init();
        long[] result = shortestPath();

        PrintWriter pw = new PrintWriter(System.out);

        for (int i = 1; i <= n; i++) {
            pw.print(result[i]);
            if (i != n) {
                pw.print(" ");
            }
        }

        pw.println();
        pw.flush();
        pw.close();
    }

    static long[] shortestPath() {
        long[] distances = new long[n+1];
        PriorityQueue<CityLength> pq = new PriorityQueue<>();

        List<CityLength> neighbors = adjList.get(1);
        if (neighbors != null) {
            pq.addAll(neighbors);
        }

        while (!pq.isEmpty()) {
            CityLength curr = pq.poll();

            if (distances[curr.targetCity] != 0) {
                if (curr.length < distances[curr.targetCity]) {
                    distances[curr.targetCity] += curr.length;
                }
            } else {
                distances[curr.targetCity] = curr.length;

                neighbors = adjList.get(curr.targetCity);
                if (neighbors != null) {
                    for (CityLength n : neighbors) {
                        pq.add(new CityLength(curr.targetCity, n.targetCity, n.length + distances[curr.targetCity]));
                    }
                }
            }

        }

        distances[1] = 0;

        return distances;
    }

    static void init() throws IOException {
        String input = InputUtils.readFileToString("src/main/java/cses/graph_algorithms/shortest_route_1/input1.txt");
        InputUtils.setInputFromString(input);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        adjList = new HashMap<>();

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int key = Integer.parseInt(st2.nextToken());

            List<CityLength> neigh = adjList.computeIfAbsent(key, k -> new ArrayList<>());
            neigh.add(new CityLength(key, Integer.parseInt(st2.nextToken()), Integer.parseInt(st2.nextToken())));
            adjList.put(key, neigh);
        }

        br.close();
    }

    static class CityLength implements Comparable<CityLength> {
        int sourceCity;
        int targetCity;
        long length;

        CityLength(int sourceCity ,int targetCity, long length) {
            this.sourceCity = sourceCity;
            this.targetCity = targetCity;
            this.length = length;
        }

        @Override
        public int compareTo(CityLength o) {
            return Long.compare(length, o.length);
        }
    }
}
