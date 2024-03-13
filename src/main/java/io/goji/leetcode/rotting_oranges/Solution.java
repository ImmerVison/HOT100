package io.goji.leetcode.rotting_oranges;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {


    public int orangesRotting(int[][] grid) {
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int rows = grid.length, cols = grid[0].length;
        int freshOranges = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) {
                    queue.offer(new int[]{r, c});
                } else if (grid[r][c] == 1) {
                    freshOranges++;
                }
            }
        }

        int minutes = 0;
        while (!queue.isEmpty() && freshOranges > 0) {
            int size = queue.size();
            minutes++;
            for(int i = 0; i < size; i++) {
                int[] point = queue.poll();
                for(int[] dir : directions) {
                    int r = point[0] + dir[0];
                    int c = point[1] + dir[1];
                    if (r >= 0 && c >= 0 && r < rows && c < cols && grid[r][c] == 1) {
                        grid[r][c] = 2;
                        queue.offer(new int[]{r, c});
                        freshOranges--;
                    }
                }
            }
        }
        if(freshOranges > 0) return -1;
        return minutes;

    }




}
