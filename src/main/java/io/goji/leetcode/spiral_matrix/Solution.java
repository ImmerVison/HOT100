package io.goji.leetcode.spiral_matrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] visited = new int[m][n];
        int x = 0, y = 0, dirIdx = 0, cnt = 0;
        while (cnt < m * n) {
            result.add(matrix[x][y]);
            visited[x][y] = 1;
            int nextX = x + dirs[dirIdx][0];
            int nextY = y + dirs[dirIdx][1];
            if (nextX < 0 || nextX >= m || nextY < 0 || nextY >= n || visited[nextX][nextY] == 1) {
                dirIdx = (dirIdx + 1) % 4;
            }
            x += dirs[dirIdx][0];
            y += dirs[dirIdx][1];
            cnt++;
        }


        return result;
    }
}
