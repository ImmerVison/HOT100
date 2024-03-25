package io.goji.leetcode.course_schedule;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {
    int N = 100010, M = 5010;
    int[] in = new int[N], he = new int[N], e = new int[M], ne = new int[M];
    int idx;
    void add(int a, int b) {
        e[idx] = b;
        ne[idx] = he[a];
        he[a] = idx++;
        in[b]++;
    }


    public boolean canFinish(int n, int[][] g) {
        Arrays.fill(he, -1);
        for (int[] info : g) add(info[1], info[0]);
        int ans = 0;
        Deque<Integer> d = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (in[i] == 0) d.addLast(i);
        }
        while (!d.isEmpty()) {
            int t = d.pollFirst();
            ans++;
            for (int i = he[t]; i != -1; i = ne[i]) {
                int j = e[i];
                if (--in[j] == 0) d.addLast(j);
            }
        }
        return ans == n;

    }




}
