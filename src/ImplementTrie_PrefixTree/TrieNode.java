package ImplementTrie_PrefixTree;

public class TrieNode {
	// Initialize your data structure here.
    public boolean hit;
    public TrieNode[] next;
    public TrieNode() {
        hit = false;
        next = new TrieNode[26];
    }
}
