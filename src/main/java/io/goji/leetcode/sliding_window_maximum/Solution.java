package io.goji.leetcode.sliding_window_maximum;


import java.util.PrimitiveIterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
//        Queue<Integer> queue = new PriorityQueue<>(k, (a, b) -> b - a);
//        for (int i = 0; i < k; i++) {
//            queue.add(nums[i]);
//        }
//        int[] result = new int[nums.length - k + 1];
//        result[0] = queue.peek();
//        for (int i = k; i < nums.length; i++) {
//            queue.remove(nums[i - k]);
//            queue.add(nums[i]);
//            result[i - k + 1] = queue.peek();
//        }
//        return result;

//        int[][] F = new int[nums.length][nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            F[i][0] = nums[i];
//        }
//
//        int l = (int) (Math.log(nums.length) / Math.log(2.0));
//        for(int j = 1; j <= l; j++) {
//            for (int i = 0; i < nums.length; i++) {
//                if (i + (1 << j) - 1 < nums.length) {
//                    F[i][j] = Math.max(F[i][j - 1], F[i + (1 << (j - 1))][j - 1]);
//                }
//            }
//        }
//
//        int[] result = new int[nums.length - k + 1];
//        for (int i = 0; i < nums.length - k + 1; i++) {
//            result[i] = st_query(F, nums, i, i + k - 1);
//        }
//        return result;



        PriorityQueue<int[]> pq = new PriorityQueue<>(k, (a, b) -> b[0] - a[0]);
        for (int i = 0; i < k; i++) {
            pq.add(new int[]{nums[i], i});
        }

        int[] result = new int[nums.length - k + 1];
        result[0] = pq.peek()[0];
        for (int i = k; i < nums.length; i++) {
            pq.add(new int[]{nums[i], i});
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }
            result[i - k + 1] = pq.peek()[0];
        }
        return result;

    }


//    public static int st_query(int[][] F, int[] nums, int i, int j) {
//        int k = (int) (Math.log(j - i + 1) / Math.log(2.0));
//        return Math.max(F[i][k], F[j - (1 << k) + 1][k]);
//    }

}
