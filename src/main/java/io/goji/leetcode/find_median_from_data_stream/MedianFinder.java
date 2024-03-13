package io.goji.leetcode.find_median_from_data_stream;

import java.util.PriorityQueue;


class MedianFinder {

    PriorityQueue<Integer> leftPq;
    PriorityQueue<Integer> rightPq;

    public MedianFinder() {
        leftPq = new PriorityQueue<>((a, b) -> b - a);
        rightPq = new PriorityQueue<>((a, b) -> a - b);
    }

    public void addNum(int num) {
        if (leftPq.isEmpty() || num <= leftPq.peek()) {
            leftPq.add(num);
        } else {
            rightPq.add(num);
        }

        if (leftPq.size() > rightPq.size() + 1) {
            rightPq.add(leftPq.poll());
        } else if (rightPq.size() > leftPq.size()) {
            leftPq.add(rightPq.poll());
        }
    }

    public double findMedian() {
        if (leftPq.size() == rightPq.size()) {
            return (leftPq.peek() + rightPq.peek()) / 2.0;
        } else {
            return leftPq.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
