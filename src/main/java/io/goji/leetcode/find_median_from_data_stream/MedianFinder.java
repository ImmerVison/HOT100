package io.goji.leetcode.find_median_from_data_stream;

import java.util.PriorityQueue;


class MedianFinder {

    PriorityQueue<Integer> pq;

    public MedianFinder() {
        pq = new PriorityQueue<>();
    }

    public void addNum(int num) {
        pq.add(num);
    }

    public double findMedian() {
        int[] sorted = pq.stream().mapToInt(Integer::intValue).toArray(); ///TODO: This is not efficient
        int n = sorted.length;
        if (n % 2 == 0) {
            return (sorted[n / 2 - 1] + sorted[n / 2]) / 2.0;
        } else {
            return sorted[n / 2];
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
