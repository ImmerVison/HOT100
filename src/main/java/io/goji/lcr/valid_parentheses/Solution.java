package io.goji.lcr.valid_parentheses;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.add(c);
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }

                char top = stack.peekLast();
                if(c == ')' && top != '(') {
                    return false;
                }
                if(c == '}' && top != '{') {
                    return false;
                }
                if(c == ']' && top != '[') {
                    return false;
                }
                stack.pollLast();
            }
        }
        return stack.isEmpty();
    }
}
