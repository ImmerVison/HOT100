package io.goji.leetcode.number_islands;

public class Solution {
    public int numIslands(char[][] grid) {
        int[][] directions = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int rows = grid.length;
        int cols = grid[0].length;
        int islands = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == '1') {
                    islands++;
                    dfs(grid, i, j, directions);
                }
            }
        }
        return islands;
    }

    void dfs(char[][] grid, int i, int j, int[][] directions) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        for(int[] direction : directions) {
            dfs(grid, i + direction[0], j + direction[1], directions);
        }
    }
}
