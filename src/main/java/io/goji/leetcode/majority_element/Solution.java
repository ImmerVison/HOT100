package io.goji.leetcode.majority_element;

import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            if(map.get(num) > len / 2){
                return num;
            }
        }

        return -1;
    }
}
