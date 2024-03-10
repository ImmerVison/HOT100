package io.goji.leetcode.sort_list;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        list.sort(Integer::compareTo);
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (int i : list) {
            current.next = new ListNode(i);
            current = current.next;
        }
        return dummy.next;
    }
}
