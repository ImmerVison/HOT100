package io.goji.hot75.find_difference_two_arr;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        Set<Integer> temp = new HashSet<>(set1);
        set1.removeAll(set2);
        set2.removeAll(temp);
        return new ArrayList<>() {{
            add(set1.stream().sorted().collect(Collectors.toList()));
            add(set2.stream().sorted().collect(Collectors.toList()));
        }};







    }
}
