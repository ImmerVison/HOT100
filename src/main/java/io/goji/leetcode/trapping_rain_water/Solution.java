package io.goji.leetcode.trapping_rain_water;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int trap(int[] height) {




        Deque<Integer> stack = new ArrayDeque<>();

        int water = 0;
        for (int i = 0; i < height.length; i++) {
            int rightHeight = height[i];
            while (!stack.isEmpty() && height[stack.peek()] < rightHeight) {
                int bottomHeight = height[stack.pop()];
                if (stack.isEmpty()) {
                    break;
                }
                int leftHeight = height[stack.peek()];
                int width = i - stack.peek() - 1;
                int heightDiff = Math.min(leftHeight, rightHeight) - bottomHeight;
                water += width * heightDiff;
            }
            stack.push(i);
        }
        return water;

//        int len = height.length;
//        int[] leftMax = new int[len], rightMax = new int[len];
//        leftMax[0] = height[0];
//        for (int i = 1; i < len; i++) {
//            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
//        }
//        rightMax[len - 1] = height[len - 1];
//        for (int i = len - 2; i >= 0 ; i--) {
//            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
//        }
//        int ans = 0;
//        for (int i = 1; i < len - 1; i++) {
//            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
//        }
//        return ans;
    }
}