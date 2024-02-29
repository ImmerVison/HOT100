package io.goji.leetcode.group_anagrams;

import java.util.*;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
//    Map<String, List<String>> map = new HashMap<>();
//    for (String str : strs) {
//      char[] charArray = str.toCharArray();
//      Arrays.sort(charArray);
//      String sortedStr = new String(charArray);
//      if (!map.containsKey(sortedStr)) {
//        map.put(sortedStr, new ArrayList<>());
//      }
//      map.get(sortedStr).add(str);
//    }
//    return new ArrayList<>(map.values());
        List<List<String>> result = new ArrayList();
        Map<String, List<String>> sortedStrs = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            String sortedStr = groupByAlpha(strs[i]);
            if(!sortedStrs.containsKey(sortedStr)) {
                List<String> ele = new ArrayList<>();
                ele.add(strs[i]);
                sortedStrs.put(sortedStr, ele);
            } else {
                List<String> ele = sortedStrs.get(sortedStr);
                ele.add(strs[i]);
            }
        }
        for (Map.Entry<String, List<String>> entry : sortedStrs.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
  }


  public String groupByAlpha(String str) {
    char[] charArray = str.toCharArray();
    Arrays.sort(charArray);
    return new String(charArray);
  }


}
