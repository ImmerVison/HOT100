package io.goji.leetcode.lru_cache;

import java.util.*;

class LRUCache {

    LinkedHashMap<Integer, Integer> innerMap;

    public LRUCache(int capacity) {
        innerMap = new LinkedHashMap<>(capacity, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return innerMap.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        innerMap.put(key, value);
    }


//    class Pair {
//        int key;
//        int value;
//        Pair(int key, int value) {
//            this.key = key;
//            this.value = value;
//        }
//    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
