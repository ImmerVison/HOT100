package io.goji.leetcode.copy_list_with_random_pointer;


import io.goji.leetcode.reverse_nodes_k_group.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public Node copyRandomList(Node head) {
        Node dummy = new Node(-1);
        Map<Integer, Node> idxToNode = new HashMap<>();
        Map<Node, Integer> nodeToIdx = new HashMap<>();
        Node node = head;
        dummy.random = null;
        dummy.next = head;
        Node ptr = dummy;
        int idx = 0;
        while (node != null) {
            Node newNode = new Node(node.val);
            ptr.next = newNode;
            idxToNode.put(idx, newNode);
            nodeToIdx.put(node, idx);
            idx++;
            node = node.next;
            ptr = ptr.next;
        }
        ptr = dummy.next;
        while (head != null) {
            if (head.random != null) {
                int randomIdx = nodeToIdx.get(head.random);
                ptr.random = idxToNode.get(randomIdx);
            } else {
                ptr.random = null;
            }
            head = head.next;
            ptr = ptr.next;
        }
        return dummy.next;

    }




    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
