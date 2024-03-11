package io.goji.leetcode.kth_largest_ele_array;

import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k , (a, b) -> a - b);
        for(int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        for(int i = k; i < nums.length; i++) {
            if(nums[i] > pq.peek()) {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();

    }
}
