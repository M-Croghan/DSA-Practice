package data_structures.tries;

public class Trie {

    private TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    private class TrieNode{
        private TrieNode[] children;
        private boolean isWord;

        public TrieNode(){
            this.children = new TrieNode[26]; //storing english words (A-Z)
            this.isWord = false;
        }
    }

    public void insert(String word){

    }

    public boolean search(String word){
        return false;
    }
}
