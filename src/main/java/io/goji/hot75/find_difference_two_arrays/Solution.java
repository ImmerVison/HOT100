package io.goji.hot75.find_difference_two_arrays;

import java.util.*;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int num : set) {
            if (num > 0) {
                list1.add(num);
            } else {
                list2.add(num);
            }
        }
        result.add(list1);
        result.add(list2);
        return result;

    }
}
