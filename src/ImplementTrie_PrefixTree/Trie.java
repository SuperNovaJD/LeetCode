package ImplementTrie_PrefixTree;

public class Trie {
    private TrieNode root;

    public Trie() {
		root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        root = insert(root,word,0);
    }
    public TrieNode insert(TrieNode root, String word, int depth){
        if(root == null){
            root = new TrieNode();
        }
        if(depth == word.length()){
            root.hit = true;
            return root;
        }
        char c = word.charAt(depth);
        root.next[c - 'a'] = insert(root.next[c - 'a'], word, depth+1);
        return root;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        if(word == null){
            return false;
        }
        TrieNode result = search(root,word,0);
        if(result == null){
            return false;
        }
        return result.hit;
    }
    public TrieNode search(TrieNode root, String word, int depth){
        if(root == null){
            return null;
        }
        if(depth == word.length()){
            return root;
        }
        char c = word.charAt(depth);
        return search(root.next[c - 'a'], word, depth+1);
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode temp = startsWith(root, prefix, 0);
        if(temp == null) return false;
        return true;
    }
    public TrieNode startsWith(TrieNode root, String prefix, int depth){
        if(root == null) return null;
        if(depth == prefix.length()) return root;
        char c = prefix.charAt(depth);
        return startsWith(root.next[c - 'a'], prefix, depth + 1);
    } 
}
