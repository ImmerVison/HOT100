package io.goji.leetcode.largest_rectangle_histogram;

public class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        //找到左右两侧最近的高度小于 hhh 的柱子，这样这两根柱子之间（不包括其本身）的所有柱子高度均不小于 hhh，并且就是 iii 能够扩展到的最远范围。
        int[] left = new int[n]; // left[i] is the index of the first element that is smaller than heights[i] on the left of i
        int[] right = new int[n]; // right[i] is the index of the first element that is smaller than heights[i] on the right of i
        left[0] = -1; // there is no element on the left of the first element
        right[n - 1] = n; // there is no element on the right of the last element
        for (int i = 1; i < n; i++) { // calculate left
            int p = i - 1;
            while (p >= 0 && heights[p] >= heights[i]) { // find the first element that is smaller than heights[i]
                p = left[p];
            }
            left[i] = p;
        }
        for (int i = n - 2; i >= 0; i--) { // calculate right
            int p = i + 1; //
            while (p < n && heights[p] >= heights[i]) { // find the first element that is smaller than heights[i]
                p = right[p];
            }
            right[i] = p;
        }
        int maxArea = 0; // calculate the max area
        for (int i = 0; i < n; i++) { // iterate through the heights
            maxArea = Math.max(maxArea, heights[i] * (right[i] - left[i] - 1)); // calculate the area
        }
        return maxArea;
    }
}
