package io.goji.hot75.move_zeroes;

public class Solution {
    public void moveZeroes(int[] nums){
        int ptr = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[ptr++] = nums[i];
            }
        }
        for(int i = ptr; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
