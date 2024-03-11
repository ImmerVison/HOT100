package io.goji.leetcode.pascals_triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(){{add(1);}});
        if (numRows == 1) {
            return result;
        }
        result.add(new ArrayList<>(){{add(1); add(1);}});
        if (numRows == 2) {
            return result;
        }
        int layer = 2;
        while (layer < numRows) {
            List<Integer> curLayer = new ArrayList<>();
            List<Integer> prevLayer = result.get(layer - 1);
            curLayer.add(1);
            for (int i = 1; i < prevLayer.size(); i++) {
                curLayer.add(prevLayer.get(i - 1) + prevLayer.get(i));
            }
            curLayer.add(1);
            result.add(curLayer);
            layer++;
        }

        return result;

    }
}
