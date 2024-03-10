package io.goji.leetcode.search_2d_matrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            int midValue = matrix[mid / matrix[0].length][mid % matrix[0].length];
            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return matrix[left / matrix[0].length][left % matrix[0].length] == target;
    }
}
