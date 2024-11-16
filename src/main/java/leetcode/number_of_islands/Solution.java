package leetcode.number_of_islands;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length; //max y
        int n = grid[0].length; // max x
        int cnt = 0;

        if (m != 1) {
            boolean[][] visited = new boolean[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == '1' && !visited[i][j]) {
                        Deque<Coordinate> queue = new ArrayDeque<>();

                        queue.add(new Coordinate(i, j));
                        visited[i][j] = true;

                        while (!queue.isEmpty()) {
                            Coordinate current = queue.pollFirst();
                            int y = current.y;
                            int x = current.x;


                            if (y != 0 && grid[y - 1][x] == '1' && !visited[y-1][x]) { //top
                                queue.offerLast(new Coordinate(y-1, x));
                                visited[y-1][x] = true;
                            }

                            if (y != m - 1 && grid[y + 1][x] == '1' && !visited[y+1][x]) { //bot
                                queue.offerLast(new Coordinate(y+1, x));
                                visited[y+1][x] = true;
                            }

                            if (x != 0 && grid[y][x - 1] == '1' && !visited[y][x-1]) { //left
                                queue.offerLast(new Coordinate(y, x-1));
                                visited[y][x-1] = true;
                            }

                            if (x != n - 1 && grid[y][x + 1] == '1' && !visited[y][x+1]) { //right
                                queue.offerLast(new Coordinate(y, x+1));
                                visited[y][x+1] = true;
                            }
                        }

                        cnt += 1;
                    }
                }
            }


        } else {
            for (int i = 0; i < n; i++) {
                if (grid[0][i] == '1') {
                    if (i == n-1) {
                        cnt += 1;
                        break;
                    }

                    if (grid[0][i+1] == '0') {
                        cnt += 1;
                    }
                }
            }
        }

        return cnt;
    }

    class Coordinate {
        int x;
        int y;

        Coordinate(int y, int x) {
            this.x = x;
            this.y = y;
        }
    }
}
