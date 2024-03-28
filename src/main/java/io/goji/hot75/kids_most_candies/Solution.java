package io.goji.hot75.kids_most_candies;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}
