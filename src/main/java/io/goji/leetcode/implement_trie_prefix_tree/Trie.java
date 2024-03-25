package io.goji.leetcode.implement_trie_prefix_tree;

class Trie {
    private boolean isEnd;

    private Trie[] child;

    /** Initialize your data structure here. */
    public Trie() {
        isEnd = false;
        child = new Trie[26];
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        Trie node = this;
        for (char c : word.toCharArray()) {
            if (node.child[c - 'a'] == null) {
                node.child[c - 'a'] = new Trie();
            }
            node = node.child[c - 'a'];
        }
        node.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie node = this;
        for (char c : word.toCharArray()) {
            if (node.child[c - 'a'] == null) {
                return false;
            }
            node = node.child[c - 'a'];
        }
        return node.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */

    public boolean startsWith(String prefix) {
        Trie node = this;
        for (char c : prefix.toCharArray()) {
            if (node.child[c - 'a'] == null) {
                return false;
            }
            node = node.child[c - 'a'];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // returns true
        System.out.println(trie.search("app"));     // returns false
        System.out.println(trie.startsWith("app")); // returns true
        trie.insert("app");
        System.out.println(trie.search("app"));     // returns true
    }



}
