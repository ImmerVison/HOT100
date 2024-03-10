package io.goji.leetcode.merge_intervals;

import java.util.Arrays;

public class Solution {
    public int[][] merge(int[][] intervals) {
      if(intervals.length == 0) {
        return new int[0][2];
      }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] currentInterval = intervals[0];
        int[][] result = new int[intervals.length][2];
        int resultIndex = 0;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                result[resultIndex++] = currentInterval;
                currentInterval = intervals[i];
            }
        }
        result[resultIndex] = currentInterval;
        return Arrays.copyOf(result, resultIndex + 1);
    }
}
